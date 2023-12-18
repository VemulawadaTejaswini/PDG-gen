import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int c[][] = new int[3][3];
		
		for(int i =0 ; i  < 3 ; i++){
			for(int j =0 ; j < 3 ;j++){
				c[i][j] = sc.nextInt();
			}
		}
		
		int a[] = new int[3];
		int b[] = new int[3];
		
		a[0] = 0;
		b[0] = c[0][0];
		b[1] = c[0][1];
		b[2] = c[0][2];
		a[1] = c[1][0] - b[0];
		a[2] = c[2][0] - b[0];
		
		int x = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(c[i][j] != a[i]+b[j]){
					x = 1;
				}
			}
		}
		System.out.println(x==0?"Yes":"No");
	}
}
