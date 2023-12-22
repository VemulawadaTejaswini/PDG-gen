import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, m ,a, h, p, q, maxh = 0, xpos, ypos;
		
		n = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();
		
		int[][] horline = new int[n-1][m];
		
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < m; j++){
				horline[i][j] = 0;
			}
		}
		
		for(;;){
			h = sc.nextInt();
			p = sc.nextInt();
			q = sc.nextInt();
			if((h|p|q) == 0) break;
			if(maxh < h) maxh = h;

			horline[p-1][h-1] = 1;
		}
		
		xpos = a-1;
		ypos = maxh-1;

		while(ypos >= 0){
			if(xpos == 0){
				if(horline[xpos][ypos] == 1){
					xpos++;
				}
			}else if(xpos == n - 1){
				if(horline[xpos - 1][ypos] == 1){
					xpos--;
				}
			}else{
				if(horline[xpos - 1][ypos] == 1){
					xpos--;
				}else if(horline[xpos][ypos] == 1){
					xpos++;
				}
			}
			ypos--;
			System.out.println(xpos + 1);
		}
		
		System.out.println(xpos + 1);
	}
}