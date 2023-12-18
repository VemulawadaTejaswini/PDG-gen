import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		Counter counter = new Counter(h, w);
		int[][] field = new int[h][w];
		for (int i = 1; i <= n; i++) {
		    int x = sc.nextInt();
		    for (int j = 0; j < x; j++) {
		        field[counter.y][counter.x] = i;
		        counter.next();
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        if (j > 0) {
		            sb.append(" ");
		        }
		        sb.append(field[i][j]);
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
   }
   
   static class Counter {
       int height;
       int width;
       int y;
       int x;
       
       public Counter (int height, int width) {
           this.height = height;
           this.width = width;
       }
       
       public void next() {
           if (y % 2 == 0) {
               if (x == width - 1) {
                   y++;
               } else {
                   x++;
               }
           } else {
               if (x == 0) {
                   y++;
               } else {
                   x--;
               }
           }
       }
   }
}

