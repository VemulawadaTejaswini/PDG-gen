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
		int pair_count=0;
		for(int i=0;i<n;i++){
			if(a[i]%2==0){
				pair_count+=a[i]/2-1;
				a[i]=2;
			}else{
				pair_count+=a[i]/2;
				a[i]=a[i]%2;
			}
		}
		for(int i=0;i<n-2;i++){
			if(a[i]==1 && a[i+1]==2 && a[i+2]==1){
				pair_count+=2;
				a[i]=a[i+1]=a[i+2]=0;
			}
		}
		for(int i=0;i<n;i++){
			if(a[i]==2)pair_count++;
		}
		System.out.println(pair_count);
		
	}

}