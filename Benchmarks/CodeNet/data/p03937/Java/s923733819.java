import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			
			char[][] ac = new char[h][w];
			String S;
			
			for(int i=0;i<h;i++) {
				S = sc.next();
				for(int j=0;j<w;j++) {
					ac[i][j] = S.charAt(j);
				}
			}
			
			int num = 0;
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(ac[i][j]=='#') {
						num++;
					}
				}
			}
				
			
			if(num != h+w-1) {
				System.out.println("Impossible");
				return;
			}
			
			int x = 0;
			int y = 0;
			
			for(int j=1;j<num;j++) {
				
				boolean flg = false;
				
				if(y<w-1) {
					if((ac[x][y+1]=='#')) {
						y++;
						continue;
					}
				}
				
				
				if(x<h-1) {
					if((ac[x+1][y]=='#')) {
						x++;
						continue;
					}
				}
				
				System.out.println("Impossible");
				return;
				
			}
			
			System.out.println("Possible");
			
		}
		
	}
	
