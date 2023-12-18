import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0; i<N; i++) {
			a[i]=sc.nextInt();
		}
		int buf[] = new int[W];
		boolean forward = true;
		int c=0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(a[c]<=0)c++;
				if(forward) {
					buf[j]=c+1;
				}else {
					buf[W-1-j]=c+1;
				}
				a[c]--;
			}
			for(int j=0; j<W; j++) {
				System.out.print(buf[j] + (j==W-1 ? "\n" : " "));
			}
			forward=!forward;
		}
		sc.close();
	}

}
