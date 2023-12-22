import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int[] h=new int[n];
		boolean[] an=new boolean[n];
		int a;
		int b;
		for(int i=0;i<n;i++){
			h[i]=sc.nextInt();
			an[i]=true;
		}
		for(int i=0;i<m;i++){
			a=sc.nextInt();
			b=sc.nextInt();
			if(h[a-1]>=h[b-1]){
				an[b-1]=false;
			}
			if(h[a-1]<=h[b-1]){
				an[a-1]=false;
			}
		}
		int ans=0;
		for(int i=0;i<n;i++){
			if(an[i]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
