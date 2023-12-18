import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//int k = sc.nextInt();

		int[] array = new int[3];
		array[0]=n;
		array[1]=m;
		//array[2]=k;

		long count=0;
		Arrays.sort(array);

		if(n<m) {
			System.out.println(0);
		}else {
			System.out.println(10);
		}

		//System.out.println(array[0]+array[1]);
	}
}


