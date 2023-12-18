import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A =sc.nextInt();
		int B =sc.nextInt();
		int ans = N%(A+B);
		int ans1 = N/(A+B);
	    if(ans>A) {
	    	ans = ans-(ans-A);
	    }
		System.out.print(A*ans1+ans);
	}
}

