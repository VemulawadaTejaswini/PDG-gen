import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static boolean[] isPrime;
	static int[] primes=new int[78500];
	static int N,P;
	static{
		isPrime=new boolean[1000000];
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2;i*i<=isPrime.length;i++){
			if(isPrime[i]){
				for(int j=i+i;j<isPrime.length;j+=i){
					isPrime[j]=false;
				}
			}
		}
		int cnt=0;
		for(int i=0;i<isPrime.length;i++){
			if(isPrime[i]){
				primes[cnt++]=i;
			}
		}
	}
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			N=cin.nextInt();
			P=cin.nextInt();
			if(N+P==-2)break;
			int idx=0;
			for(int i=0;i<primes.length;i++){
				if(primes[i]>N){
					idx=i;
					break;
				}
			}
			List<Integer> list = new LinkedList<Integer>();
			for(int i=idx;i<20+idx;i++){
				for(int j=i;j<idx+20;j++){
					list.add(primes[i]+primes[j]);
				}
			}
//			System.out.println(idx);
			Collections.sort(list);
			int cnt=0;
			for(int s:list){
//				System.out.println(s);
				cnt++;
				if(cnt==P){
					System.out.println(s);
					break;
				}
			}
		}
	}

}