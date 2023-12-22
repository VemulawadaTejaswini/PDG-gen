import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int dice_1[] = new int[6];
		int dice_2[] = new int[6];
		int pip[] = new int[6];
		int count = 0;
		int order = 0;
		boolean bdice_front = false;
		int dice_front = 0;
		boolean bdice_up = false;
		int dice_up = 0;
		boolean judge;
		
		//サイコロの目の入力
		dice_1 =  make_dice(scanner);
		dice_2 =  make_dice(scanner);
		
		pip = dice_1;
		
		//命令数実行
		do {
			dice_up = dice_2[0];
			dice_front = dice_2[1];
			bdice_front = false;
			bdice_up = false;
			
			for( int i = 0; i < 4; i ++ ){
				for( int j = 0; j < 2; j ++ ){
					if(!bdice_front) {
						for( int k = 0; k < 4; k ++ ){
							if( !bdice_front ) {
								pip = diceroll_s(pip);
								if( pip[1] == dice_front ){
									bdice_front = true;
								}
							}
						}
						pip = diceroll_e(pip);
					}
				}
				if( pip[0] == dice_up ){
					bdice_up = true;
					break;
				}
				pip = diceroll_e(pip);
				
			}
			
			if( dice_2[2] == pip[2] ){
				judge = true;
			}else{
				judge = false;
			}
			//右面出力
			if( judge ){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			
			count ++;
			if( count >= order){
				break;
			}
		}while(true );
		
		scanner.close();
	}
	
	public static int[] make_dice ( Scanner scanner){
		int dice[] = new int[6];
		
		for(int i = 0; i < 6; i ++){
			dice[i] = scanner.nextInt();
		}
		
		return dice;
	}

	public static int[] diceroll_n(int[] pip){
		int dice[] = new int[6];
		for(int i = 0; i < 6; i ++){
			dice[i] = pip[i];
		}
		pip[0] = dice[1];
		pip[1] = dice[5];
		pip[2] = dice[2];
		pip[3] = dice[3];
		pip[4] = dice[0];
		pip[5] = dice[4];
		
		return pip;
	}

	public static int[] diceroll_e (int[] pip){
		int dice[] = new int[6];
		for(int i = 0; i < 6; i ++){
			dice[i] = pip[i];
		}
		pip[0] = dice[3];
		pip[1] = dice[1];
		pip[2] = dice[0];
		pip[3] = dice[5];
		pip[4] = dice[4];
		pip[5] = dice[2];
		
		return pip;
	}

	public static int[] diceroll_w (int[] pip){
		int dice[] = new int[6];
		for(int i = 0; i < 6; i ++){
			dice[i] = pip[i];
		}
		pip[0] = dice[2];
		pip[1] = dice[1];
		pip[2] = dice[5];
		pip[3] = dice[0];
		pip[4] = dice[4];
		pip[5] = dice[3];
		
		return pip;
	}

	public static int[] diceroll_s (int[] pip){
		int dice[] = new int[6];
		for(int i = 0; i < 6; i ++){
			dice[i] = pip[i];
		}
		pip[0] = dice[4];
		pip[1] = dice[0];
		pip[2] = dice[2];
		pip[3] = dice[3];
		pip[4] = dice[5];
		pip[5] = dice[1];
		
		return pip;
	}
	
}

