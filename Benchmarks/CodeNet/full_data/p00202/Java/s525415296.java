import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0202().doIt();
	}

	class AOJ0202{
		void doIt(){
			int N = 1000001;
			boolean prime[] = new boolean[N];
			Arrays.fill(prime, true);prime[0]=false;prime[1]=false;
			for(int i=2;i<N;i++)if(prime[i])for(int s=i+i;s<N;s+=i)prime[s] = false;
			while(true){
				int n = in.nextInt();//ryouri
				int x = in.nextInt();//kin
				if(n+x==0)break;
				int[] cook = new int[n];
				for(int i=0;i<n;i++)cook[i] = in.nextInt();
				Arrays.sort(cook);				
				boolean res[] = new boolean[x+1];
				res[0] = true;
				for(int i=0;i<n;i++){
					for(int s=cook[i];s<=x;s++)if(s-cook[i]>=0&&res[s-cook[i]])res[s] = true;
				}
				
				
//				for(int i=0;i<=x-10000;i++)System.out.println(i+" "+res[i]);
				
				int result = 0;
				for(int i=x;i>=0;i--)if(prime[i]&&res[i]){
					result = i;
					break;
				}
				System.out.println(result==0?"NA":result);
			}
		}
	}

}