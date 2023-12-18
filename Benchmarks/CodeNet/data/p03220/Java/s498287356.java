//B
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt(),a = sc.nextInt();
		int[] h = new int[n];
		int snum = -1;
		double d = 0,tem,hd;
		for(int i = 0;i < n;i ++) {
			tem = 0; hd = 0;
			h[i] = sc.nextInt();
			tem = t - h[i] * 0.006;
			hd = Math.abs(a-tem);
			if(i == 0 || d >= hd) {
				snum = i+1;
				d = hd;
			}
		}
		System.out.println(snum);
	}
}