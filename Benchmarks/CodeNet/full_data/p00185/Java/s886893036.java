import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean[] isPrime = new boolean[1000000+10];
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 2; i*i <= isPrime.length;i++){
			if(isPrime[i]){
				for(int j = i+i; j < isPrime.length; j+=i){
					isPrime[j]=false;
				}
			}
		}
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int count = 0;
			for(int i = 2; i <= n/2;i++){
				if(isPrime[i] && isPrime[n-i]){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}