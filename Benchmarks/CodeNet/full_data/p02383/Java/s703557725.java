import java.util.Scanner;

public class Main {

	static private int[] dice = new int[6];

	/**
	 * 上面を確認
	 */
	static public int checkUpper() {
		return dice[0];
	}

	/**
	 * 入力された方向に移動
	 * @param order
	 */
	static public void move(String order) {

		for(Character s : order.toCharArray()) {
			int buf;
	        switch(s){
	            case 'N':{
	                buf = dice[0];
	                dice[0] = dice[1];
	                dice[1] = dice[5];
	                dice[5] = dice[4];
	                dice[4] = buf;
	                break;
	            }
	            case 'E':{
	                buf = dice[0];
	                dice[0] = dice[3];
	                dice[3] = dice[5];
	                dice[5] = dice[2];
	                dice[2] = buf;
	                break;
	            }
	            case 'W':{
	                buf = dice[0];
	                dice[0] = dice[2];
	                dice[2] = dice[5];
	                dice[5] = dice[3];
	                dice[3] = buf;
	                break;
	            }
	            case 'S':{
	                buf = dice[0];
	                dice[0] = dice[4];
	                dice[4] = dice[5];
	                dice[5] = dice[1];
	                dice[1] = buf;
	                break;
	            }
	        }
		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[6];
		for(int i=0; i<6; i++) {
			nums[i] = sc.nextInt();
		}

		String order = sc.next();

		sc.close();

		dice = nums;
		move(order);

		System.out.println(checkUpper());
	}

}
