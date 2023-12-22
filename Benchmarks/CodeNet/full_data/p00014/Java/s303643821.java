import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0014_Integral {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0014_Integral test = new Problem0014_Integral();
			Main test = new Main();
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while((line = reader.readLine()) != null) {
				try {
					int number = Integer.parseInt(line);
					System.out.println(test.getSummationArea(number));
				} catch(NumberFormatException e) {
					break;
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	int getSummationArea(int gap) {
		int x = 0;
		int summationArea = 0;
		while(x < 600) {	//600ÌñªInputÌf[^Å é±Æ©çAíÉ x=600 ÆÈéªI
			summationArea += getArea(x, gap);
			x += gap;
		}
		
		return summationArea;
	}
	int getArea(int start, int width) {
		int height = start * start;
		int area = width * height;
	//	System.out.println("x:" + start + "\theight:" + height + "\twidth:" + width + "\tarea:" + area);
		return area;
	}
}