import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		String s=sc.next();
		long ans=0;
		if(p==2 || p==5){
			for(int i=n-1; i>=0; i--){
				if((s.charAt(i)-'0')%p==0){
					ans+=i+1;
				}
			}
			System.out.println(ans);
			return;
		}
		int[] mod=new int[p];
		int ms=0;
		int ten=1;
		for(int i=0; i<n; i++){
			ms=(ms+(s.charAt(i)-'0')*ten)%p;
			ten=(ten*10)%p;
			mod[ms]++;
		}
		ans=mod[0];
		for(int i=0; i<p; i++){
			ans+=mod[i]*(mod[i]-1)/2;
		}
		System.out.println(ans);
	}
}
