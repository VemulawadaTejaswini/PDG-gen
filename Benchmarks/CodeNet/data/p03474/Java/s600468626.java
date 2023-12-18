import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();

		String[] ss = S.split("-", 0);
		/*System.out.println(A);
		System.out.println(B);
		System.out.println(S);
		System.out.println(ss[0]);*/
		if(ss[0].length() == A && ss[1].length() == B){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}