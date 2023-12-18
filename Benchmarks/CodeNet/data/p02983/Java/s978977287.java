
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		long N = input.nextInt();
        long D = input.nextInt();
        long remain = (long)(2 * Math.pow(10,9)) * 2;
		for(long i = N+1; i <= D; i++ ){
			long currentMod = (N*i)%2019;
			if(currentMod < remain ){
				remain = currentMod;
			}
		}
		System.out.println(remain);
	}
}
