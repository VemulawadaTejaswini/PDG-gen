import java.util.*;
public class Main {
	static boolean prime[] = new boolean[50001];
	static int P(int n){
		int cnt=0,memo=0;
		for(int i=0;n!=cnt;i++){
			if(i>10050)break;
			if(prime[i]){
				memo=i;
				cnt++;
			}
		}
		return memo;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i=0;i<prime.length;i++)prime[i]=true;
		prime[0]=false;prime[1]=false;
		for(int s=0;s<prime.length;s++){
			if(prime[s])
				for(int i=s+s;i<prime.length;i+=s)prime[i]=false;
		}
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0)break;
			int sum=0;
			for(int i=1;i<=n;i++)sum+=P(i);
			System.out.println(sum);
		}
	}
}