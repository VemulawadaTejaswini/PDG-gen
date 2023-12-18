import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		long pair_count=0;
		for(int i=0;i<n;i++){
			pair_count+=(long)a[i]/2;
			a[i]=a[i]%2;
			if(i<n-1){
			if(a[i]==1 && a[i+1]>=1){
				pair_count+=1;
				a[i]--;
				a[i+1]--;
			}
			}
		}
		System.out.println(pair_count);
		
	}

}
