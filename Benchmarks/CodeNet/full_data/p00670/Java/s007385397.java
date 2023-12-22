import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n,S,ans;
	static int[]a;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			n=cin.nextInt();
			S=cin.nextInt();
			if(n+S==0)break;
			a=new int[n];
			ans=0;
			for(int i=0;i<n;i++){
				a[i]=cin.nextInt();
			}
			Arrays.sort(a);
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(a[j]>S-a[i]-1){
						ans=ans+n-j;
						break;
					}
				}
			}
			System.out.println(ans);
			/*
			for(int i=0;i<n;i++){
				int s=Arrays.binarySearch(a,i,n, S-a[i]+1);
				if(s<0){
					s*=-1;
					s--;
					System.out.println("-");
				}
				else{
					int tmp=s;
					for(int j=s;j<n;j++){
						if(S-a[i]<a[j]){
							s=j;
							break;
						}
					}
				}
				System.out.println(s);
				ans+=n-s;
			}
			System.out.println(ans);
			*/
		}

	}

}