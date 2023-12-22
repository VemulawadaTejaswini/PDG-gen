import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int hako[]=new int [n];
		int list[]=new int [m];
		int a=0;
		int b=0;
		int ans=0;
		for(int i=0;i<n;i++) {
			hako[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++) {
			list[j]=sc.nextInt();
		}
		
		while(true) {
			if(a<=n-1 && b<=m-1) {
				if(hako[a]<=list[b] && hako[a]<=k){
					k-=hako[a];
					ans++;
					a++;
				}
				else if(hako[a]>list[b] && list[b]<=k){
					k-=list[b];
					ans++;
					b++;
				}
				else {
					break;
				}
			}
			else if(a==n){
				if(hako[a]>list[b] && list[b]<=k){
					k-=list[b];
					ans++;
					b++;
				}
				else {
					break;
				}
			}
			else if(b==m) {
				if(hako[a]<=list[b] && hako[a]<=k){
					k-=hako[a];
					ans++;
					a++;
				}
				else {
					break;
				}
			}
			else {
				break;
			}
			
		}
		
		System.out.println(ans);
	}

}
