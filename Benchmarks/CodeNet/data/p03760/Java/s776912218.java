import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] k = sc.next().toCharArray();
		char[] g = sc.next().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < g.length; i++) {
			sb.append(k[i]).append(g[i]);
		}
		if(k.length - g.length == 1) {
			sb.append(k[k.length-1]);
		}
		System.out.println(sb);
	}
}
