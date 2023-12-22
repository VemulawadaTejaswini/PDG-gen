import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int dice[];
		int pter[][];
		int que = 0;
		int mei1 = 0;
		int mei2 = 0;
		String mei;
		String han;
		String str;
		
		mei = "";
		dice = new int[6];
		pter = new int[6][6];
		
		for(int i=0;i<6;i++){
			
			dice[i] = as.nextInt();
			
		}
		
		for(int i=0;i<6;i++){
			
			switch(i){
				case 0:
					pter[0][1] = dice[2];
					pter[0][2] = dice[4];
					pter[0][4] = dice[3];
					pter[0][3] = dice[1];
					break;
				
				case 1:
					pter[1][5] = dice[2];
					pter[1][2] = dice[0];
					pter[1][0] = dice[3];
					pter[1][3] = dice[5];
					break;
					
				case 2:
					pter[2][5] = dice[4];
					pter[2][4] = dice[0];
					pter[2][0] = dice[1];
					pter[2][1] = dice[5];
					break;
					
				case 3:
					pter[3][5] = dice[1];
					pter[3][1] = dice[0];
					pter[3][0] = dice[4];
					pter[3][4] = dice[5];
					break;
					
				case 4:
					pter[4][5] = dice[3];
					pter[4][3] = dice[0];
					pter[4][0] = dice[2];
					pter[4][2] = dice[5];
					break;
					
				case 5:
					pter[5][4] = dice[2];
					pter[5][2] = dice[1];
					pter[5][1] = dice[3];
					pter[5][3] = dice[4];
					break;
			}
			
		}
		
		que = as.nextInt();
		
		for(int i=0;i<que;i++){
			
			mei1 = as.nextInt();
			mei2 = as.nextInt();
			
			str = String.valueOf(pter[mei1-1][mei2-1]);
			System.out.println(str);
			
		}
		
		

	}

}