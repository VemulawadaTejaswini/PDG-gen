import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] h=new long[n];
		for(int i=0; i<n; i++){
			h[i]=sc.nextLong();
		}
		int ans=0;
		int count=0;
		for(int i=0; i<n-1; i++){
			if(h[i]>=h[i+1]){
				count++;
			}else{
				ans=Math.max(ans,count);
				count=0;
			}
		}
		ans=Math.max(ans,count);
		System.out.println(ans);
	}
}
