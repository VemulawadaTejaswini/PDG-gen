import java.io.*;
import java.util.*;
public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		//int count = sc.nextInt();
		//int nums[] = new int[count];
		/*int size = nums.length / 2;
		for(int i = 0; i < nums.length; i++) {
		}*/
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1*num2;
		if(num3 % 2 == 0) System.out.println("Even");
		else System.out.println("Odd");
	}
}