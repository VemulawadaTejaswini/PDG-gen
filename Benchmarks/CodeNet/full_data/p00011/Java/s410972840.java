import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();

		int[] num = new int[w];
		for(int i = 0;i < num.length;i++) {
			num[i] = i+1;
		}
		for(int i = 0;i<n;i++) {
			String ab_st = sc.next();
			String[] ab = ab_st.split(",");
			int a = Integer.parseInt(ab[0]) - 1;
			int b = Integer.parseInt(ab[1]) - 1;

			int sub=0;
			sub = num[a];
			num[a] = num[b];
			num[b] = sub;

		}
		for(int i = 0;i < num.length;i++) {
			System.out.printf("%d\n",num[i]);
		}
		sc.close();
	}
}

