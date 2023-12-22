import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
				if(n == 0)break;
				int[] s = new int[n];
				int total = 0;
					for(int i = 0;n != i;i++){
						s[i] = sc.nextInt();
						total = total + s[i];
					}
				int average = total / n;
				int[] sa = new int[n];
				int sa_total = 0;
					for(int i = 0;n != i;i++){
						sa[i] = average - s[i];
						sa_total = sa_total + (sa[i] * sa[i]);
					}
				double result = sa_total / n;
				System.out.println(Math.sqrt(result));
		}
	}
}