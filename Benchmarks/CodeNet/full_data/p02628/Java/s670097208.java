import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int array[] = new int[a];
		for(int i = 0;i < a; i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		System.out.println(array[0]+array[1]+array[2]);
		scan.close();
	}
}