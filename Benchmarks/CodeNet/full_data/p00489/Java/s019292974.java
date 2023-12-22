import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [][] array = new int [n + 1][n + 1];
		int [] kei = new int [n + 1];
		int a,b,c,d;
		int x = n * (n - 1) / 2;
		for (int i = 0; i < x; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			if(c > d){
				array[a][b] = 3;
				array[b][a] = 0;
			}
			else if(c < d){
				array[a][b] = 0;
				array[b][a] = 3;
			}
			else if(c == d){
				array[a][b] = 1;
				array[b][a] = 1;
			}
		}
		
		for(int i = 1; i <= n; i++) {
			kei[i] = 0;
			for(int j = 1; j <= n; j++) {
				kei[i] += array[i][j];
			}
		}
		for(int i = 1; i <= n; i++) {
			int counter = 1;
			for(int j = 1; j <= n; j++) {
				if(kei[i] != kei[j]){
					if(kei[i] < kei[j]){
						counter++;
					}
				}
			}
			System.out.println(counter);
		}
	}

}