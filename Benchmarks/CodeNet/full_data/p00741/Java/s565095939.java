import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h;
		int count = 0;

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0) break;
			int[][] c = new int[h][w];

			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					c[i][j] = sc.nextInt();
				}
			}

			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(c[i][j]==1){
						search(c, i, j, w, h);
						count++;
					}
				}
			}

			System.out.println(count);

			count = 0;
		}
	}

	static void search(int[][] c, int i, int j, int w, int h){
		c[i][j] = 0;

		if(i>0){
			if(j>0){
				if(c[i-1][j-1]==1) search(c, i-1, j-1, w, h);
			}
			if(c[i-1][j]==1) search(c, i-1, j, w, h);
			if(j<w-1){
				if(c[i-1][j+1]==1) search(c, i-1, j+1, w, h);
			}
		}

		if(j>0){
			if(c[i][j-1]==1) search(c, i, j-1, w, h);
		}
		if(j<w-1){
			if(c[i][j+1]==1) search(c, i, j+1, w, h);
		}

		if(i<h-1){
			if(j>0){
				if(c[i+1][j-1]==1) search(c, i+1, j-1, w, h);
			}
			if(c[i+1][j]==1) search(c, i+1, j, w, h);
			if(j<w-1){
				if(c[i+1][j+1]==1) search(c, i+1, j+1, w, h);
			}
		}
	}
}