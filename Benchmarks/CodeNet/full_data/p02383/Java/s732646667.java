import java.util.Scanner;

/**
 * input１行目に各面の整数が、図に示すラベルの順番に空白区切りで与えられます。 
 * ２行目に命令を表す１つの文字列が与えられます。命令はそれぞれ図に示す４方向を表す文字 E、N、S、W を含む文字列です。 
 * output
 * すべての命令を実行した後のサイコロの上面の数を１行に出力してください。 
 * @author U633758
 *
 */

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static int T=0,S=0,E=0,W=0,N=0,U=0;
	public static void main(String[] args){

		
		Dice_Input();

		Dice_Move(scan.next());
		System.out.println(T);		//上面を出力
	}

	/**
	 * 現在のダイスの状態をInput
	 * @param args
	 */
	public static void Dice_Input(){
		int[] Dice_num = new int[6];

		for(int i = 0;i < 6; i++){
			Dice_num[i] = scan.nextInt();;
		}

		T = Dice_num[0];		//Top
		S = Dice_num[1];
		E = Dice_num[2];
		W = Dice_num[3];
		N = Dice_num[4];
		U = Dice_num[5];		//Under

		//return Dice_num;



	}

	/**
	 * 入力されたコマンド(S,E,N,W)に応じてダイスを動かす
	 * @param command
	 */
	public  static void Dice_Move(String command){
		//command:NSWE
		char[] command_c = command.toCharArray();
		for(int i = 0;i < command_c.length; i++){
			switch(command_c[i]){
			case 'S':
				MoveSouth();
				break;
			case 'E':
				MoveEast();
				break;
			case 'N':
				MoveNorth();
				break;
			case 'W':
				MoveWest();
				break;
			default:
				break;
			}
		}
	}


	public static void MoveSouth(){
		int a = T;
		T = N;
		N = U;
		U = S;
		S = a;
	}
	public static void MoveEast(){
		int a = T;
		T = W;
		W = U;
		U = E;
		E = a;
	}
	public static void MoveNorth(){
		int a = T;
		T = S;
		S = U;
		U = N;
		N = a;
	}
	public  static void MoveWest(){
		int a = T;
		T = E;
		E = U;
		U = W;
		W = a;
	}

}
