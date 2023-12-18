import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = m;
		for(int p=m/n+1; p>=1; p--){
			if(m%p==0 && m/p>=n){
				ans = p;
              	break;
			}
		}
		System.out.println(ans);
	}
}