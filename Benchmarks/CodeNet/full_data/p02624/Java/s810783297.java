import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int MAX = 10000000;
		int[] cnt = new int[MAX+1];  
		
		Long ans = 0l;
		for(int i = 1 ; i <= n ; i++) {
			int value =  i;
			while(MAX >= value) {
				cnt[value]++;
				value += i;
			}
			
			ans += cnt[i]*i;
		}
		System.out.println(ans);
	}
}


