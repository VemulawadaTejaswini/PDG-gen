import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < k; i++) {//お菓子の種類の回数だけ、回す
			int d = sc.nextInt();//dでお菓子の個数を受け取り、その回数だけ回す。
			for (int j = 0; j < d; j++) {
				a[sc.nextInt() - 1]++;//お菓子の個数
			}
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}