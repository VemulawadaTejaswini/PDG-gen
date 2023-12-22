import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean prime[] = new boolean[1000000];
		for(int i=0;i<prime.length;i++)prime[i]=true;
		prime[0]=false;prime[1]=false;
		for(int s=0;s<prime.length;s++){
			if(prime[s])
				for(int i=s+s;i<prime.length;i+=s)prime[i]=false;
		}
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0)break;
			int result=0;
			for(int i=2;i<=n;i++)if(prime[i]&&prime[i-2])result = i;
			System.out.println(result-2+" "+result);
		}
	}
}