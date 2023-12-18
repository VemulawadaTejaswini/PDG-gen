import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[]a=new int[n];
		int min=Integer.MAX_VALUE;
		int max=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(min>a[i])min=a[i];
			if(max<a[i])max=a[i];
		}
		
		if(max<k){
			System.out.println("IMPOSSIBLE");
			return;
		}
		
		for(int i=0;i<n;i++){
			if(a[i]==k){
				System.out.println("POSSIBLE");
				return;
			}
		}
		if(n==1){
			if(a[0]!=k){
				System.out.println("IMPOSSIBLE");
				return;
			}else{
				System.out.println("POSSIBLE");
				return;
			}
		}
		
		boolean flag=false;
		for(int i=0;i<n;i++){
			if(a[i]%min!=0)flag=true;
		}
		
		if(flag)System.out.println("POSSIBLE");
		else System.out.println("IMPOSSIBLE");
		
	}
}