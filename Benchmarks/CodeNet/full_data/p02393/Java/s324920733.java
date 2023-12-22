import java.util.Arrays;
import java.util.Scanner;





public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int[] aaa = {a,b,c};

		Arrays.sort(aaa);

		for(int i : aaa) {
            System.out.println(i);
		}
	}

}

