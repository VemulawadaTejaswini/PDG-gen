import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int[] list = new int[] {a,b,c};
		Arrays.sort(list);
		for(int i=0;i<k;i++) {
			list[2] *= 2;
		}
		System.out.println(list[0]+list[1]+list[2]);
	}
}