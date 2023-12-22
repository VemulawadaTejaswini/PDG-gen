
import java.util.Scanner;

public class Main  {

	public static  void main(String[] args) {
		int A , B , C , K;
	int T = 0 ;
	Scanner sc = new Scanner(System.in);
	A = Integer.parseInt(sc.next());
	B = Integer.parseInt(sc.next());
	C = Integer.parseInt(sc.next());
	K = Integer.parseInt(sc.next());
	while(K != 0 && A != 0) {
		T++;
		A--;
		K--;
	}while(K != 0 && B != 0) {
		B--;
		K--;
	}while(K != 0 && C != 0) {
		T--;
		C--;
		K--;
	}
	System.out.println(T);
	}

}
