import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		int ggc = getGreatestCommonMeasure(list.get(0), list.get(1));
		for (int i=2; i<n; i++) {
			ggc = getGreatestCommonMeasure(ggc, list.get(i));
		}
		
		System.out.println(ggc);
	}
	
	public static int getGreatestCommonMeasure(int a, int b) {
		int amari;
		int x = a;
		int y = b;
		while ((amari = x % y) != 0) {
			x = y;
			y = amari;
		}
		
		return y;
	}
}