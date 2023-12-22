
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		boolean[] prime_number = new boolean[1000000];
		Arrays.fill(prime_number,true);
		prime_number[0] = false;
		prime_number[1] = false;
		for(int i=2;i<prime_number.length;i++){
			if(prime_number[i]){
				for(int j=i+i;j<prime_number.length;j+=i){
					prime_number[j] = false;
				}
			}
		}
		while(stdIn.hasNext()){
			int n = stdIn.nextInt();
			int count = 0;
			
			for(int i=2;i<=n;i++){
				if(prime_number[i]){
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}