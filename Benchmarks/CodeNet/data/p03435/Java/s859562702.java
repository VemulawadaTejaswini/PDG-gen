import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C(sc);
	}
	
	public static void A(Scanner sc) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		if(N%500 <=A) out.println("Yes");
		else out.println("No");
	}
	
	public static void B(Scanner sc) {
		int N = sc.nextInt();
		int ret = 0;
		Integer[] a = new Integer[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			if(i%2==0) ret+=a[i];
			else ret-=a[i];
		}
		out.println(ret);
	}
	
	public static void C(Scanner sc) {
		int[][] c = new int[4][4];
		for(int i=1;i<4;i++) {
			for(int j=1;j<4;j++) {
				c[i][j] = sc.nextInt();
			}
		}
		if(c[1][1]-c[1][2]==c[2][1]-c[2][2] && c[2][1]-c[2][2]==c[3][1]-c[3][2] &&
				c[1][2]-c[1][3]==c[2][2]-c[2][3] && c[2][2]-c[2][3]==c[3][2]-c[3][3] &&
				c[1][1]-c[1][3]==c[2][1]-c[2][3] && c[2][1]-c[2][3]==c[3][1]-c[3][3]) out.println("Yes");
		else out.println("No");
	}
}
