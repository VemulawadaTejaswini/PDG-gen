import java.util.Scanner;
public class Main {
private static Scanner s;
public static void main(String[] args) {
	s = new Scanner(System.in);
	int a = s.nextInt();
	int[] b = new int[a];
	int l = Integer.MIN_VALUE;
	int[] c = new int[10001];

	for(int i = 0;i < a;i++) {
		int tmp = s.nextInt();
		b[i] = tmp;
		l = Math.max(l, b[i]);
		c[tmp]++;
	}

	for(int i = 1;i < c.length;i++){
			c[i] += c[i-1];
	}
	int[] d = new int[a];

	for(int i = a - 1;i >= 0;i--) {
		d[--c[b[i]]] = b[i];
	}
	System.out.print(d[0]);
	for(int i = 1;i < a-1;i++) {
		System.out.print(" " + d[i]);
	}
	System.out.print(" " + d[a-1]);
	System.out.println("");
}
}

