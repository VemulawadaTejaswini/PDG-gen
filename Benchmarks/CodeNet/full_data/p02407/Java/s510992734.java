import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		int i,j;

		while(n!=0) {
			for(i=0;i<n;i++) {
				list.add(scan.nextInt());
			}
			for(j = n-1;j>=0;j--) {
				System.out.print(" "+list.get(j));
			}
			n = scan.nextInt();
		}
		scan.close();
	}

}

