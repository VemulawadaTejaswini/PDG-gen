import java.util.*;
class Main {
	public static int j;
	public static int y;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		j = stdIn.nextInt();
		y = stdIn.nextInt();
		
		solv(0,0,new int[10],0);
	}
	
	public static void solv(int a, int b, int[] c,int d) {
		if(a == j && b == y) {
			for(int i = 0; i < d; i++) {
				System.out.print((c[i] == 1)?"A":"B");
			}
			System.out.println();
			return;
		}
		if(a > j || b > y) {
			return;
		}
		if((a == 5 && b <= 3) || (a <= 3 && b == 5)) return;
		if(a == 5 && b == 5) return;
		int[] ca = new int[10];
		int[] cb = new int[10];
		for(int i = 0; i < d; i++) {
			ca[i] = c[i];
			cb[i] = c[i];
		}
		ca[d] = 1;
		cb[d] = 0;
		solv(a+1,b,ca,d+1);
		solv(a,b+1,cb,d+1);
	}
}