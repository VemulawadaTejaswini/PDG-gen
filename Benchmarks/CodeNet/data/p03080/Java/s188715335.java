import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int R = 0;
		for(int i=0; i<N; i++)
			if(s[i] == 'R')
				R++;
		
		System.out.println(R>N-R ? "Yes" : "No");
		sc.close();
	}
}
