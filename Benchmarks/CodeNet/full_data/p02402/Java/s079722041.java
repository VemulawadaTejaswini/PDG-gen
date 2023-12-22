import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int sum=0;
		int num[] = new int[count+1];

		for(int i =0;i<count;i++){
			num[i] = scan.nextInt();
			sum += num[i];
		}

		Arrays.sort(num);

		System.out.println(num[1] + " " + num[count] + " " + sum);

		scan.close();

	}
}