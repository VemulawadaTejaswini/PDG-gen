import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		long ans = 1;
		for(int i = 0;i < n; ++i){
			long a = Long.parseLong(scan.next());
			if(Math.log10(a) + Math.log10(ans) > 18 || ans*a > 1000000000000000000L){
				ans = -1;
			}else if(a == 0){
				ans = 0;
			}else if(ans != -1){
				ans *= a;
			}
		}
		System.out.print(ans);
	}
}