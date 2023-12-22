import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^-0-9.]+");

		while (scan.hasNext()) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int s = scan.nextInt();

			switch(s){
			case 3:
				color(x+2,y);
				color(x,y+2);
				color(x-2,y);
				color(x,y-2);
			case 2:
				color(x+1,y+1);
				color(x+1,y-1);
				color(x-1,y+1);
				color(x-1,y-1);
			case 1:
				color(x,y);
				color(x+1,y);
				color(x,y+1);
				color(x-1,y);
				color(x,y-1);
			}
		}
		
		int max=0;
		int count=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(a[i][j]==0)
					count++;
				
				max = Math.max(a[i][j], max);
			}
		}
		System.out.println(count);
		System.out.println(max);
	}

	static int[][] a = new int[10][10];

	static void color(int i, int j) {
		if (i < 0 || j < 0) {
			return;
		}
		if (i > 9 || j > 9) {
			return;
		}
		a[i][j]++;
	}

}