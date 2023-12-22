import java.util.Arrays;
import java.util.Scanner;
public class AOJ0565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pasta = new int [3];
		int[] juice = new int [2];
		pasta[0] = sc.nextInt();
		pasta[1] = sc.nextInt();
		pasta[2] = sc.nextInt();
        juice[0] = sc.nextInt();
        juice[1] = sc.nextInt();
        Arrays.sort(pasta);
        Arrays.sort(juice);
        System.out.println(pasta[0]+juice[0]-50);
	}

}