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
		int tre = 0;
		String mei;
		String han;
		String str;
		
		mei = "";
		dice = new int[6];
		
		for(int i=0;i<6;i++){
			
			dice[i] = as.nextInt();
			
		}
		
		mei = as.next();
		
		for(int i=0;i<mei.length();i++){
			
			han = String.valueOf(mei.charAt(i));
			
			switch (han){
				case "E":
					tre = dice[0];
					dice[0] = dice[3];
					dice[3] = dice[5];
					dice[5] = dice[2];
					dice[2] = tre;
					break;
					
				case "N":
					tre = dice[0];
					dice[0] = dice[1];
					dice[1] = dice[5];
					dice[5] = dice[4];
					dice[4] = tre;
					break;
					
				case "S":
					tre = dice[0];
					dice[0] = dice[4];
					dice[4] = dice[5];
					dice[5] = dice[1];
					dice[1] = tre;
					break;
					
				case "W":
					tre = dice[0];
					dice[0] = dice[2];
					dice[2] = dice[5];
					dice[5] = dice[3];
					dice[3] = tre;
					break;
					
					
			}
			
		}
		
		str = String.valueOf(dice[0]);
		System.out.println(str);

	}

}