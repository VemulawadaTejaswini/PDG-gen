import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] str = new int[5];
		for(int i=0; i<5; i++){
			str[i] = scan.nextInt();
		}
		Arrays.sort(str);
		System.out.println(str[4] + " " + str[3] + " " + str[2] + " " + str[1] + " " + str[0]);
	}
}