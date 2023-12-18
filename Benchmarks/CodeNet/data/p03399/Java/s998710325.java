import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E;
		if(A>B) {
			if(C>D) {
				E = B+D;
			}else {
				E=B+C;
			}
		}else if(C>D) {
			E=A+D;
		}else {
			E=A+C;
		}
		System.out.println(E);
	}
}
