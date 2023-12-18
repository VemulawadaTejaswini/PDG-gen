import java.util.Scanner;

public class Main  {

	public static  void main(String[] args) {
		int A , B , C , K;
	int T = 0 , G = 0;
	Scanner sc = new Scanner(System.in);
	A = Integer.parseInt(sc.next());
	B = Integer.parseInt(sc.next());
	C = Integer.parseInt(sc.next());
	K = Integer.parseInt(sc.next());
	for(int D = K; D > 0 ;D--) {
		if(A - T > 0) {
			T++;
		}else if(B - G > 0) {
			G++;
		}else {
			T--;;
		}
		}
	System.out.println(T);
	}

}
