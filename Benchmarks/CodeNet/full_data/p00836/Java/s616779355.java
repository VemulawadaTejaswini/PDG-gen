import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean[] is=new boolean[10001];
		Arrays.fill(is,true);
		is[0]=is[1]=false;
		for(int i=2;i*i<=is.length;i++){
			if(is[i]){
				for(int j=i+i;j<is.length;j+=i){
					is[j]=false;
				}
			}
		}
		int[] primes=new int[5000];
		int cnt=0;
		for(int i=0;i<is.length;i++){
			if(is[i]){
				primes[cnt++]=i;
			}
		}
		while(true){
			int n=cin.nextInt();
			if(n==0)break;
			int ans=0;
			for(int i=0;i<cnt;i++){
				int sum=0;
				for(int j=i;j<cnt;j++){
					sum+=primes[j];
					if(sum>n){
						break;
					}
					if(sum==n){
						ans++;
					}
				}
			}
			System.out.println(ans);
		}

	}

}