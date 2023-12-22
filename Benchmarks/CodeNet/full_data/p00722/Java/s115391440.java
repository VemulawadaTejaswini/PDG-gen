import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int a = stdIn.nextInt();
			int d = stdIn.nextInt();
			int n = stdIn.nextInt();

			if(a==0 && d==0 && n==0) break;

			boolean[] prime = new boolean[1000000];
			Arrays.fill(prime,true);
			prime[0] = false;
			prime[1] = false;

			for(int i=2; i<prime.length; i++){
				int j = i;
				while((i+j)<prime.length){
					j+=i;
					prime[j] = false;
				}
			}

			int value = a;
			int count = prime[value]?1:0;

			while(count!=n){
				value+=d;
				if(prime[value]) count++;
			}
			System.out.println(value);
		}
	}
}