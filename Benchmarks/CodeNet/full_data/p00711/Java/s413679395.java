import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int[] v1 = { 0, 1, 0, -1 };
	static int[] v2 = { 1, 0, -1, 0 };
	static int[][] field;
	static int count = 0;
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while (true) {
			int w = cin.nextInt();
			int h = cin.nextInt();
			if(w+h==0){break;}
			
			int startx = 0, starty = 0;
			count=0;
			field = new int[h + 2][w + 2];
			for (int i = 1; i <= h; i++) {
				String str = cin.next();
				for (int j = 1; j <= w; j++) {
					if (str.charAt(j-1) == '.') {
						field[i][j] = 1;
					} else if (str.charAt(j-1) == '#') {
						field[i][j] = 2;
					} else if (str.charAt(j-1) == '@') {
						field[i][j] = 1;
						startx = i;
						starty = j;
					}
				}
			}
			Integer[] start = {startx,starty};
			Stack<Integer[]> s = new Stack<Integer[]>();
			s.add(start);
			while(!s.isEmpty()){
				Integer[] a = s.pop().clone();
				count++;
				field[a[0]][a[1]]=2;
				for(int i = 0;i<4;i++){
					int xx = a[0]+v1[i];
					int yy = a[1]+v2[i];
					if(field[xx][yy]==1){
						Integer[] next={xx,yy};
						s.add(next.clone());
					}
				}
			}
			System.out.println(count);
		}
	}

}