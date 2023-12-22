import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int c, m1, m2, m3, m4, s1, s2, s3, s4;
		int m, s;
		int[][] score;
		
		
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			
			score = new int[4][2];
			for(int i = 0; i < 2; i++){
				score[i][1] = 3600;
			}
			for(int i = 0; i < n; i++){
				c = scan.nextInt();
				m1 = scan.nextInt();
				s1 = scan.nextInt();
				m2 = scan.nextInt();
				s2 = scan.nextInt();
				m3 = scan.nextInt();
				s3 = scan.nextInt();
				m4 = scan.nextInt();
				s4 = scan.nextInt();
				
				m = m1 + m2 + m3 + m4;
				s = s1 + s2 + s3 + s4;
				
				if(score[3][1] < m*60 + s){
					score[2][1] = score[3][1];
					score[2][0] = score[3][0];
					score[3][1] = m*60 + s;
					score[3][0] = c;

				}else if(score[2][1] < m*60 + s){
					score[2][1] = m*60 + s;
					score[2][0] = c;
				}
				if(score[0][1] > m*60 + s){
					score[1][1] = score[0][1];
					score[1][0] = score[0][0];
					score[0][1] = m*60 + s;
					score[0][0] = c;
				}else if(score[1][1] > m*60 + s){
					score[1][1] = m*60 + s;
					score[1][0] = c;
				}
			}
			for(int j = 0; j < 3; j++){
				System.out.println(score[j][0]);
			}
		}
	}
}