
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long min = scan.nextInt();
		long max = scan.nextInt();
		long divideNum = scan.nextInt();
		long divideCount1 = 0;
		long divideCount2 = 0;
		long answer = 0;
		
		for(long i = 0; i < min - 1; i++){
			if(i % divideNum == 0){
				divideCount1++;
			}
		}
		
		for(long i = 0; i <= max; i++){
			if(i % divideNum == 0){
				divideCount2++;
			}
		}
		answer = divideCount2 - divideCount1;
		System.out.println(answer);
	}

}