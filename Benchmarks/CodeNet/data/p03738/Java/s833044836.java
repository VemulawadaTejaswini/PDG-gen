import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		
		if (A.length>B.length) System.out.println("GREATER");
		else if (A.length<B.length) System.out.println("LESS");
		else if (A.length==B.length) {
			for (int i=0; i<A.length; i++) {
				if (A[i] == B[i]) continue;
				else if (A[i]>B[i]) {
					System.out.println("GREATER");
					return;
				}else if (A[i]<B[i]) {
					System.out.println("LESS");
					return;
				}
			}
			System.out.println("EQUAL");
		}
	}
}
