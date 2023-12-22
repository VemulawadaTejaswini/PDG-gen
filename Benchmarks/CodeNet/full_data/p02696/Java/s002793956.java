import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[][] d = new int[c][4];
		int[] e = new int[a];
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < 4; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; )
		*/
		int a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = 0;
		long e;
		int f = 0;
		for(int i = 1; i <= c; i++) {
			e =(a*i)/b-a*(i/b);
			if(e>d) {
				d = e;
			}
		}
		System.out.println(d);
	}
}