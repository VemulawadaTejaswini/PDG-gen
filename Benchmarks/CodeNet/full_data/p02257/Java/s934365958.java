import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void  main (String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String wdn;
		wdn = br.readLine();
		int N = Integer.parseInt(wdn);
		int ans = N;
		int num = 0;

		for (int i=0; i< N; i++) {
			String wdnum = br.readLine();
			num = Integer.parseInt(wdnum);
			if (num == 2){
				continue;
			}
			else if (num % 2 ==0){
				ans--;
				continue;
			}
			for (int j=3; j<num/2; j+=2){
				if (num%j==0) {
					ans--;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
