import java.util.*;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		
		int ans=0;
		long mod=7;
		
		HashSet<Long> Amari=new HashSet<>();
		while(true) {
			ans++;
			if(mod==0) break;
			mod=(mod*10+7)%k;
			if(Amari.contains(mod)) {
				ans=-1;
				break;
			}
			else Amari.add(mod);
		}
		System.out.println(ans);
	}
}