import java.util.*;
public class Main{
	static int a[],n,i,j,ans[],cnt;
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNextInt()){
			int n=sc.nextInt();
			int a[]=new int[n];
			if(n==0)break;
			int ans[]=new int [n];
			for( i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			for( i=0;i<n;i++){
				if(a[i]>0){
					cnt = 0;
					for(j=i;j<n;j++){
							cnt+=a[j];
							if(ans[i]<=cnt)ans[i]=cnt;
					}
				}
			}

			Arrays.sort(ans);
			System.out.println(ans[n-1]);
		}

	}
}