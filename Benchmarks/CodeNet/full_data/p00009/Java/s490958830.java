import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Max = 999999;
		ArrayList<Integer> primes = MakePrimes(Max);
		/*while(!primes.isEmpty()){
			System.out.println(primes.get(0));
			primes.remove(0);
		}*/
			while(sc.hasNextInt()){
			int a = sc.nextInt();
			int count = 0;
			for(int i=0; primes.get(i) <= a ;i++){
				count++;
			}
		System.out.println(count);
		}
	}
	static ArrayList<Integer> MakePrimes(int Max){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int[] range = new int[Max+1];	//解りやすさのためint[x]と整数xが対応することにする
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