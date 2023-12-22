import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Max = 999999;
		int dataCount = 1;
		ArrayList<Integer> primes = MakePrimes(Max);
			while(sc.hasNext()&&dataCount<=30){
			int a = sc.nextInt();
			int count = 0;
			for(int i=0; primes.get(i) <= a ;i++){
				count++;
			}
			System.out.println(count);
			dataCount++;
			}
	}
	static ArrayList<Integer> MakePrimes(int Max){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int[] range = new int[Max+1];
		for(int i = 2; i < range.length; i++){
			if(range[i]==0){
				primes.add(i);
				for(int m = 1; m*i<=Max; m++){
					range[m*i]=1;
				}
			}
		}
		return primes;

	}
}