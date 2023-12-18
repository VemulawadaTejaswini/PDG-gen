import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int [a];
		for(int i = 0;i<a;i++) {
			b[i] = sc.nextInt();
		}
		int[] c = b.clone();
		Arrays.sort(c);//sort後b
		double ookii = c[a/2-1];
		double tiisai = c[a/2];
		for(int i=0;i<a;i++) {
			if(b[i]<=ookii) {
				System.out.println(tiisai);
			}else{
				System.out.println(ookii);
			}
		}
	}
}
