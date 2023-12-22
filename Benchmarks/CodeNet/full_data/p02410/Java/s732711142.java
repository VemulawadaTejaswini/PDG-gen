import java.util.Scanner;

        class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n, m, i, j;
	int a[][] = new int[100][100];
	int b[] = new int[100];
	int c[] = new int[100];
	n = scan.nextInt();
	m = scan.nextInt();
	for(i = 0; i < n; i++) {
		for(j = 0; j < m; j++) {
			a[i][j] = scan.nextInt();
		}
	}
	for(j = 0; j < m; j++) {
		b[j] = scan.nextInt();
	}
	for(i = 0; i < n; i++) {
		for(j = 0; j < m; j++) {
			c[i] += a[i][j] * b[j];
		}
		System.out.println(c[i]);
	}

	}
}