import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		double p = Math.log10(n);
		
		for(int i = 0 ; i < k ;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		int ans = n;
		
		while(true) {
			int temp = ans;
			int cnt = -1;
			while(temp > 0) {
				int x = temp % 10;
				if(list.contains(x)) {
					cnt = 0;
					break;
				}
				temp = temp/10;
			}
			if(cnt == -1) {
				break;
			}
			ans++;
		}
		
		System.out.println(ans);
	}	
}


