
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] s=new int[N];
		int sum=0;
		for(int i=0;i<N;i++){
			s[i]=sc.nextInt();
			sum+=s[i];
		}
		Arrays.sort(s);
		
		for(int i=0;i<N;i++){
			if(sum%10!=0){
				System.out.println(sum);
				return;
			}else{
				sum-=s[i];
			}
		}
		System.out.println(0);
	}
}
