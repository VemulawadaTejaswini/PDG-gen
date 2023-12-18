import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0;i < n;i++) {
			p[i] = sc.nextInt();
		}
		System.out.println(counting(p,n));
	}

	public static int counting(int[] p,int n) {
		int count = 0;
		for(int i = 0; i < n;i++) {
			count++;
			for(int j = 0;j < i + 1;j++) {
				if(p[i] > p[j]) {
					count -= 1;
					break;
				}
			}
		}
		return count;
	}

}