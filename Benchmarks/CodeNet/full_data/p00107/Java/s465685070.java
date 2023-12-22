import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int t, y, h, n;
	static double r;
	public static void main(String[] args) {
		while(read()){
		}
	}
	static boolean read(){
		t = sc.nextInt();
		y = sc.nextInt();
		h = sc.nextInt();
		if( t == 0 && y == 0 && h == 0)return false;
		n = sc.nextInt();
		//System.out.println("t = "+t+" y = "+y+" h = "+h+" n = "+n);
		for(int i = 0; i < n; i++){
			r = sc.nextInt();
			//System.out.println("r = "+r);
			solve();
		}
		return true;
	}
	static void solve(){
		double r1 = Math.sqrt(y*y + t*t)/2;
		double r2 = Math.sqrt(y*y + h*h)/2;
		double r3 = Math.sqrt(h*h + t*t)/2;
		double minR = Math.min(r1, Math.min(r2, r3));
		//System.out.println("r1 = "+r1+" r2 = "+r2+" r3 = "+r3);
		//System.out.println("minR = "+ minR);
		if( r > minR){
			System.out.println("OK");
		}else{
			System.out.println("NA");
		}
	}

}