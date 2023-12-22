import java.util.Scanner;

public class Main {
	public static int mp_dp(int[] values) {
		int maxp = values[1]-values[0];
		int minv = min(values[1],values[0]);
		for(int i=2;i<values.length;i++) {
			maxp = max(maxp,values[i]-minv);
			minv=min(minv,values[i]);
		}
		return maxp;
	}
	public static int max(int a,int b) {
		if (a>=b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static int min(int a,int b) {
		if (a>=b) {
			return b;
		}
		else {
			return a;
		}
	}
	public static void main(String[] wjy) {
		Scanner sc = new Scanner(System.in);
		int[] stock = new int[sc.nextInt()];
		for (int i=0;i<stock.length;i++) {
			stock[i]= sc.nextInt();
		}
		sc.close();
		System.out.println(mp_dp(stock));
	}
}

