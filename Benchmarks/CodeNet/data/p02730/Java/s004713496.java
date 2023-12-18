import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		
		String S = cin.next();
		
		int N = S.length();
		
		int n1 = (N-1)/2-1;
		int n2 = (N+3)/2-1;
		
		boolean flag = true;
		for(int i = 0;i<=n1;i++) {
			if(S.charAt(i)!=S.charAt(n1-i)) {
				flag = false;
				break;
			}
		}
		
		for(int j = n2;j<N;j++) {
			if(S.charAt(j)!=S.charAt(N-1-j)) {
				flag = false;
				break;
			}
		}
		
		if(flag) System.out.println("Yes");
		else System.out.println("No");

	}

}
