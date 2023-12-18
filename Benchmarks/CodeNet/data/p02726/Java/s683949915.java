import java.util.Scanner;

public class Main {
	static int dist(int N , int X , int Y , int a ,int b){
		if(b <= X){
			return b - a;
		}
		if(Y <= a){
			return b - a;
		}
		if(a <= X){
			if(Y <= b){
				int d0 = X - a;
				int d1 = b - Y;
				return d0 + d1 + 1;				
			}
			if(b < Y){
				int d0 = b - a;
				int d1 = X - a + 1 + (Y - b);
				return Math.min(d0, d1);
			}
		}
		// Y > a > X 
		if(b <= Y){
			int d0 = b - a;
			int d1 = a - X + 1 + (Y - b);
			return Math.min(d0, d1);
		}
		// X < a < Y < b
		int d0 = b -a;
		int d1 = a - X + 1 + (b - Y);
		return Math.min(d0, d1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt() - 1;
		int Y = sc.nextInt() - 1;
		int adj[][] = new int[N][N];
		for(int i = 0 ; i < N ; ++i){
			for(int j = i + 1 ; j < N ; ++j){
				int d = dist(N , X, Y , i , j);
				adj[i][j] = adj[j][i] = d;
			}
		}
		int counter[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			for(int j = i + 1 ; j < N ; ++j){
				counter[adj[i][j]]++;
			}
		}
		for(int i = 1 ; i < N ; ++i){
			System.out.println(counter[i]);
		}
	}
}
