import java.util.*;
public class Main {
	static boolean prime[] = new boolean[1000001];
	static List<Integer> hyou = new ArrayList<Integer>();
	static int sum[] = new int[1000001];
	static void doIt(){//sum[n]を埋める事を目指す
		for(int s=0;s<hyou.size();s++)for(int i=s;i<hyou.size();i++){
			if(hyou.get(i)+hyou.get(s)>=sum.length)break;
			sum[hyou.get(s)+hyou.get(i)]++;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i=0;i<prime.length;i++)prime[i]=true;
		prime[0]=false;prime[1]=false;
		for(int s=0;s<prime.length;s++){
			if(prime[s]){
				for(int i=s+s;i<prime.length;i+=s)prime[i]=false;
				hyou.add(s);
			}
		}
		for(int i=0;i<sum.length;i++){
			if(prime[i])sum[i]=1;
			else sum[i]=0;
		}
		doIt();
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0)break;
			System.out.println(sum[n]);
		}
	}
}