import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] =new int[3];
		for(int i = 0;i < 3 ;i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		
		for(int j=0;j<3;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
		scan.close();
		}
}

