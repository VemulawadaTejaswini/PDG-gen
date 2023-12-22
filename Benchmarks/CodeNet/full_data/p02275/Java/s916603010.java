import java.util.Scanner;
public class Main {
private static Scanner s;
public static void main(String[] args) {
	s = new Scanner(System.in);
	int a = s.nextInt();
	int[] b = new int[a];
	int l = Integer.MIN_VALUE;

	for(int i = 0;i < a;i++) {
		b[i] = s.nextInt();
		l = Math.max(l, b[i]);
	}
	int[] c = new int[l + 1];
	/*for(int i = 0;i <= l;i++) {
		c[i] = 0;
	}*/
	for(int i = 0;i < a;i++) {
		c[b[i]]++;
	}

	for(int i = 0;i <= l;i++) {
		if(i != 0) {
			c[i] = c[i] + c[i-1];
		}else {
			c[i] = c[i];
		}
	}
	int[] d = new int[a];

	for(int i = a - 1;i >= 0;i--) {
		d[c[b[i]]-1] = b[i];
		c[b[i]]--;
	}
	for(int i = 0;i < a;i++) {
		System.out.print(d[i]);
		if(i != a-1) {
			System.out.print(" ");
		}else {
			System.out.println("");
		}
	}
}
}

