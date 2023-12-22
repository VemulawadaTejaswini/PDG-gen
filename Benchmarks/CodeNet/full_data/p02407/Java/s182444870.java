import java.util.Scanner;
class Main {
	int[] ai = new int [100];
	int n = 0,w,j = 1,h = 1;
	public void nu () {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n >= 0 || n <= 100) {
			for(w = 0; w < n; w++) {
				ai[w] = sc.nextInt();
			}
			while(h < n && ai[j-1] < ai[j]){
				h++;
			}
			while(h < n-1) {
				for(j = h; j > 0 && ai[j-1] > ai[j]; j--) {
					int work = ai[j];
					ai[j] = ai[j-1];
					ai[j-1] = work;
				}
				h++;
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