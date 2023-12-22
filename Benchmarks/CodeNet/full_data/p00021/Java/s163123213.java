import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	static int n;
	static float[] x = new float[4];
	static float[] y = new float[4];
	static float x1, x2, y1, y2;

	public static void main(String[] args) {
		n = sc.nextInt();
		
		for(int i=0; i < n; i++){
			read();
			solve();
		}

	}
	
	static boolean read() {
		
		for(int j=0; j < 4; j++){
			x[j] = sc.nextFloat();
			y[j] = sc.nextFloat();
		}
		
		x1 = x[0] - x[1];
		x2 = x[2] - x[3];
		y1 = y[0] - y[1];
		y2 = y[2] - y[3];
		
		return true;
	}
	
	static void solve(){
		if(y1/x1 == y2/x2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}