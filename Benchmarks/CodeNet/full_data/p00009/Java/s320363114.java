import java.util.Scanner;
import java.math.*;
import java.text.*;
public class Main {

	private static boolean[] isNotPrime = new boolean[10000000];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		primeTable();
		while(input.hasNextInt()){
			int n = input.nextInt();
			if(n<2){
				System.out.println(0);
				continue;
			}
			int cnt = 0;
			for(int i=2;i<=n;i++){
				if(!isNotPrime[i]) cnt++;
			}
			System.out.println(cnt);
		}
	}

	private static void primeTable() {
		for(int i=2;i*i<10000000;i++){
			if(!isNotPrime[i]){
				for(int j=2*i; j<10000000;j+=i){
					isNotPrime[j] = true;
				}
			}
		}
	}

}