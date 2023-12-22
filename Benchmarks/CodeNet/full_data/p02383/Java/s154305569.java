import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int dice[] = new int[6];
		int pip[] = new int[6];
		int order_length = 0;
		int count = 0;
		String order;
		
		//サイコロの目の入力
		dice =  make_dice(scanner);
		
		pip = dice;
		
		//命令数取得
		order = scanner.next();
		order_length = order.length();
		String[] order_box = new String[order_length];	
		
		for( int i = 0; i < order_length ; i ++ ) {
			order_box[i] = order.substring(i, i+1);
		}
		
		//命令数実行
		while(true ){
			//命令ごとに処理
			switch( order_box[count] ) {
			case "N":
				pip = diceroll_n(pip);
				break;
			case "E":
				pip = diceroll_e(pip);
				break;
			case "S":
				pip = diceroll_s(pip);
				break;
			case "W":
				pip = diceroll_w(pip);
				break;
				
			default :
				break;
			}
			
			count ++;
			if( count >= order_length){
				break;
			}
		}
		//1番上出力
		System.out.println(pip[0]);
		
		scanner.close();
	}
	
	public static int[] make_dice ( Scanner scanner){
		int dice[] = new int[6];
		
		for(int i = 0; i < 6; i ++){
			dice[i] = scanner.nextInt();
		}
		
		return dice;
	}

	public static int[] diceroll_s (int[] pip){
		int dice[] = new int[6];
		dice = pip;
		pip[0] = dice[1];
		pip[4] = dice[2];
		pip[1] = dice[5];
		pip[5] = dice[2];
		
		return pip;
	}

	public static int[] diceroll_e (int[] pip){
		int dice[] = new int[6];
		dice = pip;
		pip[0] = dice[3];
		pip[2] = dice[0];
		pip[3] = dice[5];
		pip[5] = dice[2];
		
		return pip;
	}

	public static int[] diceroll_w (int[] pip){
		int dice[] = new int[6];
		dice = pip;
		pip[0] = dice[2];
		pip[2] = dice[5];
		pip[3] = dice[0];
		pip[5] = dice[3];
		
		return pip;
	}

	public static int[] diceroll_n (int[] pip){
		int dice[] = new int[6];
		dice = pip;
		pip[0] = dice[4];
		pip[4] = dice[5];
		pip[1] = dice[0];
		pip[5] = dice[1];
		
		return pip;
	}
	
}

