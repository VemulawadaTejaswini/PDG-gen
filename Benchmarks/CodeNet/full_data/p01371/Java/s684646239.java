import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 )break;
			else calc(n);
			
		}
	}
	public void calc(int n){
		t = new int[n+1][n+1];
		for(int i = 1; i < n+1; i ++){
			for(int j = 0; j < n+1; j++){
				t[i][j] = sc.nextInt();
			}
		}
		num = new int[(int)Math.pow(2,n)];
		allOne = "1";
		allZero = "0";
		for(int i = 1; i < n; i++){
			allOne = allOne + "1";
			allZero = allZero + "0";
		}
		int i = iter(allOne, n);
		System.out.println(i);
	}
	int num[];
	int t[][];
	String allOne;
	String allZero;
	public int iter(String binary, int n){
		if(binary.equals(allZero)){
			return 0;
		}
		else if(num[Integer.parseInt(binary, 2)] != 0){
			return num[Integer.parseInt(binary, 2)];
		}
		else{
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++){
				char c = binary.charAt(i);
				if(c == '1') {
					String b = binary.substring(0, i) + "0" + binary.substring(i+1);
					int m = num[Integer.parseInt(b, 2)];
					if(m == 0) m = iter(b, n);
					m = m + getMinTime(b, n, i+1);
					if(m < min) min = m;
				}
			}
			num[Integer.parseInt(binary, 2)] = min;
			return min;
		}
	}
	
	public int getMinTime(String b, int n, int j){
		int min = t[j][0];
		for(int i = 0; i < n; i++){
			int s = Integer.parseInt(b.substring(i, i+1)) * t[j][i+1];
			if(s != 0 && s < min) min = s;
		}
		return min;
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}