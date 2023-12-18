package Inheritance;
import java.util.Scanner;
import java.util.Arrays;
public class test {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A,B,C;
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		int[] list = new int[3];
		list[0]=A; list[1]=B; list[2]=C;
		Arrays.sort(list);
		String a = Integer.toString(list[2])+Integer.toString(list[1]);
		String b = Integer.toString(list[0]);
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
	}
}