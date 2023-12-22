import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] isPrime=new boolean[12997090];
	static{
		Arrays.fill(isPrime,true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 2;i*i<=isPrime.length;i++){
			if(isPrime[i]){
				for(int j = i+i;j<isPrime.length;j+=i){
					isPrime[j]=false;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N =cin.nextInt();
			if(N==0){
				break;
			}
			int min,max;
			min=max=N;
			for(;max<isPrime.length;max++){
				if(isPrime[max]){
					break;
				}
			}
			for(;min>0;min--){
				if(isPrime[min]){
					break;
				}
			}
			System.out.println(max-min);
		}

	}

}