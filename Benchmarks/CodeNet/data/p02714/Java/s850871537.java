import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();

		int i,j,k;
		String si,sj,sk;
		long ans = 0;
		for(j = 1; j < n - 1; j++) {
			for(i = 0; i < j; i++) {
				for(k = j + 1; k < n; k++) {
					if(j - i == k - j)
						continue;

					si = s.substring(i, i + 1);
					sj = s.substring(j, j + 1);
					sk = s.substring(k, k + 1);

					if(!(si.equals(sj)) && !(si.equals(sk)) && !(sj.equals(sk)) )
						ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
