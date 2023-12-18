import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] a = new int[M];
		int[] b = new int[M];
		
		int num1 = 0;
		int numN = 0;
		
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if(a[i] == 1) {
				num1++;
			} else if(b[i] == N) {
				numN++;
			}
		}
		
		int[] a2 = new int[numN];
		int[] b2 = new int[num1];
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < M; i++) {
			if(a[i] == 1) {
				b2[x] = b[i];
				x++;
			} else if(b[i] == N) {
				a2[y] = a[i];
				y++;
			}
		}
		
		int check = 0;
		
		if(a2.length <= b2.length) {
			for(int i = 0; i < a2.length; i++) {
				for(int j = 0; j < b2.length; j++) {
					if(a2[i] == b2[j]) {
						System.out.println("POSSIBLE");
						check++;
						break;
					}
				}
			}
		}
		if(check == 0) {
			System.out.println("IMPOSSIBLE");
		}
	}
}
