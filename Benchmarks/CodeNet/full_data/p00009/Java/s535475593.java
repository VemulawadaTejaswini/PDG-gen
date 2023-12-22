import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner cin = new Scanner(System.in);
		boolean[] isPrime = new boolean[1000000];
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 2; i < isPrime.length; i++){
			if(isPrime[i]){
				for(int j = i+i; j < isPrime.length; j+=i){
					isPrime[j]=false;
				}
			}
		}
		while(cin.hasNext()){
			int n = cin.nextInt();
			int count = 0;
			for(int i=0; i < n; i++){
				if(isPrime[i]){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}