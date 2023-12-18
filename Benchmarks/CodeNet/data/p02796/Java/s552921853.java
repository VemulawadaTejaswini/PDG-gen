import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Long> all = new HashSet<>();
				int n = sc.nextInt();
				long count = 0;
				long flag = 0;
		long [][] xl = new long[n][2];
		for(int i=0; i<n; i++) {
			xl[i][0] = sc.nextLong();
			xl[i][1] = sc.nextLong();
			long a = 0;
			flag = all.size();
			for(int j=1; j<=2*xl[i][1]-1; j++) {
				
				all.add(xl[i][0]-xl[i][1]+j);
				a++;
			}
				if(all.size()!=flag+a) {
					count++;
				}
		}
		System.out.println(n-count);
	}

}
