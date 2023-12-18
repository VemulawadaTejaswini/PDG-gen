import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] a = {1,3,1,2,1,2,1,1,2,1,2,1};
		boolean[] flg = {false,false};
		for (int i=0; i<12; i++) {
			if (x==a[i]) flg[0] =true;
			if (y==a[i]) flg[1] =true;
		}
		if (flg[0] && flg[1]) System.out.println("Yes");
		else System.out.println("No");
	}
}
