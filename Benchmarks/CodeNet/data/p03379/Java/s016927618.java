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
		Arrays.sort(b);//sort後b
		for(int i=0;i<a;i++) {
			if(c[i]>=b[a/2-1]) {
				System.out.println(b[a/2-1]);
			}else{
				System.out.println(b[a/2]);
			}
		}
	}
}