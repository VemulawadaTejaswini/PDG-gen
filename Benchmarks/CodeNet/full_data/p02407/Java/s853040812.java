import java.util.Scanner;
class Main {
	int[] ai = new int [100];
	int n = 0,w,j = 1,h,i;
	public void nu () {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n >= 0 || n <= 100) {
			for(w = 0; w < n; w++) {
				ai[w] = sc.nextInt();
			}
			for(w = n-1; w > 0; w--) {
				System.out.printf("%d ",ai[w]);
			}
			System.out.println(ai[0]);
		}
	}
	public static void main(String[] args) {
		new Main().nu();
	}
}