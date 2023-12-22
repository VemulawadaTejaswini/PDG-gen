import java.util.Scanner;


public class Main {
	
	class Field {
		int[][] ary;
		int len;
		int point;
		public Field(int[][] ary) {
			this.ary = ary;
			this.len = ary.length;
		}
		
		boolean update() {
			boolean changed = erase();
			fall();
			return changed;
		}
		
		boolean erase() {
			int buf = -1;
			boolean changed = false;
			for(int i=len-1; i>=0; i--) {
				int cnt = 0;
				for(int j=0; j<=5; j++) {
					if(j == 5) {
						//テヲツ慊ォテ・ツーツセ
						if(cnt >= 3 && buf != 0) {
							backerase(i,j,cnt);
							changed=true;
						}
					} else if(ary[i][j] != buf) {
						if(cnt >= 3 && buf != 0) {
							backerase(i,j,cnt);
							changed=true;
						}
						buf = ary[i][j];
						cnt = 1;
					} else {
						cnt++;
					}
				}
			}
			return changed;
		}
		
		void backerase(int i, int j, int cnt) {
			int pt = cnt * ary[i][j-1];
			while(cnt != 0) {
				ary[i][j-cnt] = 0;
				cnt--;
			}
			point += pt;
		}
		
		boolean fall() {
			boolean falled = false;
			for(int i=len-1; i>=0; i--) {
				for(int j=0; j<5; j++) {
					if(ary[i][j] == 0) {
						if(fallcolumn(i,j)) falled = true;
					}
				}
			}
			return falled;
		}
		
		boolean fallcolumn(int y, int j) {
			for(int i=y; i>=0; i--) {
				if(ary[i][j] != 0) {
					ary[y][j] = ary[i][j];
					ary[i][j] = 0;
					return true;
				}
			}
			return false;
		}
		
	}
	
	public Main() {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int h = scanner.nextInt();
			if(h == 0) break;
			int[][] ary = new int[h][5];
			for(int i=0;i<h;i++) {
				for(int j=0; j<5; j++) {
					ary[i][j] = scanner.nextInt();
				}
			}
			Field f = new Field(ary);
			while(f.update()){}
			System.out.println(f.point);
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}