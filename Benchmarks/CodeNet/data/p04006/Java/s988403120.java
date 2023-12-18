import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		
		int[] magic=new int[n];
		
		for(int k=0;k<n;k++){
		for(int i=0;i<n;i++){
			if(i==0){
				if(a[i]>a[n-1]+x){
					a[i]=a[n-1]+x;
					magic[i]=magic[n-1]+1;
				}
			}else{
				if(a[i]>a[i-1]+x){
					a[i]=a[i-1]+x;
					magic[i]=magic[i-1]+1;
				}
			}
		}
		}
		int magic_max=0;
		for(int i=0;i<n;i++){
			magic_max=Math.max(magic_max, magic[i]);
			a[i]-=magic[i]*x;
		}
		long sum_time=0;
		for(int i=0;i<n;i++){
			sum_time+=a[i];
		}
		sum_time+=magic_max*x;
		System.out.println(sum_time);
	}

}