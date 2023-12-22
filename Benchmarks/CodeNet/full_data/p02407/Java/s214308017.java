import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int i,j;
		int[] list = new int[n];

		for(i=0;i<n;i++) {
			list[i]=scan.nextInt();
		}
		System.out.print(list[list.length]);
		for(j=1;j<list.length+1;j++) {
			System.out.print(" "+list[list.length-j]);
		}
		System.out.println();
		scan.close();
	}
}

