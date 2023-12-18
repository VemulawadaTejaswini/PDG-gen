import java.util.Scanner;

/**
 * https://abc062.contest.atcoder.jp/tasks/abc062_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] f = new String[H];
		for(int i=0; i<H; i++) f[i] = sc.next();
		sc.close();
		
		StringBuilder tb = new StringBuilder(); 
		for(int i=0; i<W+2; i++) tb.append("#");
		
		System.out.println(tb);
		for(int i=0; i<H; i++) System.out.println("#"+f[i]+"#");
		System.out.println(tb);

	}

}
