import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long cnt = 0;
		for(int i=0;i<n;i++){
			sc.nextInt();
			char c = sc.next().charAt(0);
			if(c=='(') cnt += sc.nextInt();
			else cnt -= sc.nextInt();
			if(cnt==0) System.out.println("Yes");
			else System.out.println("No");
		}
	}

}