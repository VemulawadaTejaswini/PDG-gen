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

			int[] prime = new int[1000000];
			Arrays.fill(prime,1);
			prime[0] = 0;
			prime[1] = 0;

			for(int i=2; i<prime.length; i++){
				int j = i;
				while((i+j)<prime.length){
					j+=i;
					prime[j] = 0;
				}
			}

			int value = a;
			int count = prime[value];

			while(count!=n){
				value+=d;
				count+=prime[value];
			}
			System.out.println(value);
		}
	}
}