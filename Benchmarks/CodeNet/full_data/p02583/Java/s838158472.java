import java.util.*;


public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] l=new int[n];
		
		for(int i=0;i<n;i++) {
			l[i]=sc.nextInt();
		}
		
		Arrays.sort(l);
		
		int ans=0;
		
		for(int i=0;i<n-2;i++) {
			int e1=l[i];
			Loop: for(int j=i+1;j<n-1;j++) {
				int e2=l[j];
				if(e1==e2)continue;
				for(int k=n-1;k>j;k--) {
					int e3=l[k];
					if(e1!=e3 && e2!=e3 && e2-e1<e3 && e1+e2>e3) ans++;
						//else break Loop;
				}
			}
		}
		
		
		
		System.out.println(ans);

	}

	
}
