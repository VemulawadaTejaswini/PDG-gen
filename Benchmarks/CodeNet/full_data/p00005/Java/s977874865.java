import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0005_GCDandLCM {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0005_GCDandLCM test = new Problem0005_GCDandLCM();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null) {
				try {
					String[] textArray = line.split(" ");
					int[] numbers = new int[2];
					for(int i = 0; i < 2; i++) {
						numbers[i] = Integer.parseInt(textArray[i]);
					}
					test.showAnswer(numbers[0], numbers[1]);
				} catch(NumberFormatException e) {
					break;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void showAnswer(int x, int y) {
		int oddX = x;
		int oddY = y;
		int gcd = 1;	//Ååöñ
		
		while(oddX % 2 == 0 && oddY % 2 == 0) {
		//	System.out.println("denominator:" + 2 + "\tgcd:" + gcd + "\toddX:" + oddX + "\toddY:" + oddY);
			oddX = oddX / 2;
			oddY = oddY / 2;
			gcd = gcd * 2;
		}
		while(oddX % 3 == 0 && oddY % 3 == 0) {
		//	System.out.println("denominator:" + 3 + "\tgcd:" + gcd + "\toddX:" + oddX + "\toddY:" + oddY);
			oddX = oddX / 3;
			oddY = oddY / 3;
			gcd = gcd * 3;
		}
		
		int min = getMin(x, y);
		int denominator = 5;	//ªêi±êÅë¤Æ·é)
		for(int i = 0; denominator < Math.sqrt(min); i++) {
		//	System.out.println("denominator:" + denominator + "\tgcd:" + gcd + "\toddX:" + oddX + "\toddY:" + oddY);
			while(oddX % denominator == 0 && oddY % denominator == 0) {
				oddX = oddX / denominator;
				oddY = oddY / denominator;
				gcd = gcd * denominator;
			}
			if(i % 2 == 1) {	//2Æ3Ì{ðòÎ·
				denominator = denominator + 4;
			} else {
				denominator = denominator + 2;
			}
		}
		
		int lcm = gcd * oddX * oddY;
		System.out.println(gcd + " " + lcm);
	}
	int getMin(int x, int y) {
		int min;
		if(x > y) {	//y¬
			min = y;
		} else {	//x¬
			min = x;
		}
		return min;
	}
}