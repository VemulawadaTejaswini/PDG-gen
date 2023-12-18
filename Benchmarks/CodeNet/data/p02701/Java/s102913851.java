
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		
		int N = cin.nextInt();
		String[] S = new String[N];
		for(int i = 0;i<N;i++) S[i] = cin.next();
		
		int count = 1;
		
		for(int i = 0;i<N-1;i++) {
			for(int j = i+1;j<N;j++) {
				if(S[i].equals(S[j])) break;
				if(j==N-1) count++;
			}
		}
		
		System.out.println(count);
		
	}

}
