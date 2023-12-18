import java.util.Scanner;

public class Main implements Runnable {

	public static  void main(String[] args) {
		   new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }
    public void run() {
		
		int A , B , C , K;
	int T = 0;
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	String b = sc.nextLine();
	String c = sc.nextLine();
	String k = sc.nextLine();
	A = Integer.parseInt(a);
	B = Integer.parseInt(b);
	C = Integer.parseInt(c);
	K = Integer.parseInt(k);
	for(int D = K; D > 0 ;D--) {
		if(A != 0) {
			T = T + 1;
			A = A - 1;
		}else if(B != 0) {
			T = T + 0;
			B = B - 1;
		}else if(C != 0) {
			T = T - 1;
			C = C - 1;
		}
		}
	System.out.println( T);
	}

}
