import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		long result = 0;
		int[] nums = new int[cases];
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < cases; i++) 
			nums[i] = scanner.nextInt();
		Arrays.sort(nums);
		for(int i = 1; i < cases; i++)
			result += nums[i];
		log.write("" + result);
		log.flush();
	}
}
