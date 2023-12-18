import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	int c[][]=new int[10][10];
	int d[][]=new int[10][10];
	int INF=1001001001;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				d[i][j]=sc.nextInt();
			}
		}
		calc();
		int sum=0;
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				int k=sc.nextInt();
				if(k<0)continue;
				sum += d[k][1];
			}
		}
		System.out.println(sum);
		sc.close();
	}

	private void calc() {
		for(int k=0; k<10; k++) {
			for(int i=0; i<10; i++) {
				if(d[i][k]==INF) continue;
				for(int j=0; j<10; j++) {
					if(d[k][j]==INF)continue;
					d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
				}
			}
		}
	}
}
