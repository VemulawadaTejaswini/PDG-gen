import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		final int NUM = scan.nextInt();
		long[] needTime = new long[NUM];
		long[] deadLine = new long[NUM];
		for(int i = 0; i < NUM; i++){
			needTime[i] = scan.nextLong();
			deadLine[i] = scan.nextLong();
		}

		// sort
		for(int i = 0; i < NUM; i++){
			deadLine[i] = deadLine[i] * 10000000000L + needTime[i];
		}
		Arrays.sort(deadLine);
		for(int i = 0; i < NUM; i++){
			needTime[i] = deadLine[i] % 10000000000L;
			deadLine[i] = deadLine[i] / 10000000000L;
		}

		// check
		long sum = 0;
		boolean flag = true;
		for(int i = 0; i < NUM; i++){
			sum += needTime[i];
			if(sum > deadLine[i]){
				flag = false;
				break;
			}
		}

		// answer
		if(flag){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}
}
