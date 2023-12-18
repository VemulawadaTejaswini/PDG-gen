import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[]a=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		long min=0;
		
		int count=0;
		for(int i=0;i<n;i++){
			if(count%2==0){
				min+=a[i];
			}else{
				min-=a[i];
			}
			if(i%2==0)count++;
		}
		System.out.println(Math.abs(min));
	}
}
