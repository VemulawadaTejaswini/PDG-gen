import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x[] = new int[n];
		for(int i=0; i<n; i++){
			x[i]  = sc.nextInt();
		}
		int y[] = new int[m];
		for(int i=0; i<m; i++){
			y[i]  = sc.nextInt();
		}

		long yoko_kumiawase = n * (n-1) / 2;
		long tate_kumiawase = m * (m-1) / 2;
		long[][] yoko = new long[10][(int)(yoko_kumiawase/10+1)];
		long[][] tate = new long[10][(int)(tate_kumiawase/10+1)];
		
		int count = 0;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				yoko[count%10][(int)(count/10)] = x[j] - x[i];
				count++;
			}
		}
		count = 0;
		for(int i=0; i<m-1; i++){
			for(int j=i+1; j<m; j++){
				tate[count%10][(int)(count/10)] = y[j] - y[i];
				count++;
			}
		}
		
		long sum = 0;
		long menseki;
		for(int i=0; i<yoko_kumiawase; i++){
			for(int j=0; j<tate_kumiawase; j++){
				menseki = (yoko[i%10][(int)(i/10)] * tate[j%10][(int)(j/10)]) % 1000000007;
				sum += menseki;
				sum %= 1000000007;
			}
		}
		System.out.print(sum);
		
	}

}
