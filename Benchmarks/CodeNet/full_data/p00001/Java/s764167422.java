import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [] aa=new int[10];
		for (int i = 0; i < aa.length-1; i++) {
			int a=scan.nextInt();
			aa[i]=a;
		}
		Arrays.sort(aa);
		System.out.println(aa[9]);
		System.out.println(aa[8]);
		System.out.println(aa[7]);

	}

}
