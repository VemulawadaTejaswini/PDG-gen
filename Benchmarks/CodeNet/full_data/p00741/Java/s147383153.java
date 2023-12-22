import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int w = 0;
			int h = 0;
			int count = 0;

			w = scan.nextInt();
			h = scan.nextInt();

			if (w == 0 && h == 0)
				break;

			int[][] table = new int[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					table[i][j] = scan.nextInt();
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if(i!=0&&j!=0){
						table[i-1][j-1]=0;
					}
					if(i!=0){
						table[i-1][j]=0;
					}
					if(j!=0){
						table[i][j-1]=0;
					}
					if(i!=0&&j!=(w-1)){
						table[i-1][j+1]=0;
					}
					if (check(table, w, h, i, j)){
						count++;
					}
				}
			}
			System.out.println(count);
		}

		scan.close();
	}

	public static boolean check(int table[][], int w, int h, int a, int b) {
		boolean flag = true;
		
		if(a!=0&&b!=0){
			if(table[a-1][b-1]!=0)flag=false;
		}
		if(a!=0){
			if(table[a-1][b]!=0)flag=false;
		}
		if(b!=0){
			if(table[a][b-1]!=0)flag=false;
		}
		if(a!=0&&b!=(w-1)){
			if(table[a-1][b+1]!=0)flag=false;
		}
		if(a!=(h-1)&&b!=0){
			if(table[a+1][b-1]!=0)flag=false;
		}
		if(a!=(h-1)&&b!=(w-1)){
			if(table[a+1][b+1]!=0)flag=false;
		}
		if(a!=(h-1)){
			if(table[a+1][b]!=0)flag=false;
		}
		if(b!=(w-1)){
			if(table[a][b+1]!=0)flag=false;
		}
		return flag;
	}

}