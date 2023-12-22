import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] dice_num0,dice_num,dice_num2,dice_num3;
		dice_num0 = new int[10];
		dice_num = new int[10];
		dice_num2 = new int[10];
		dice_num3 = new int[10];
		int i;
		for(i = 0; i < 6; i++)
			dice_num[i] = scan.nextInt();
		for(i = 0; i < 6; i++)
			dice_num2[i] = scan.nextInt();
		int m;
		for(i = 0; i < 6; i++)
			dice_num0[i] = dice_num[i];
		for(i = 0; i < 4; i++){
			if(dice_num[0] == dice_num2[0] && dice_num[1] == dice_num2[1] && dice_num[2] == dice_num2[2] && dice_num[3] == dice_num2[3] && dice_num[4] == dice_num2[4] && dice_num[5] == dice_num2[5]){
			break;
			}
			else{
			dice_num3[0] = dice_num[4];
			dice_num3[1] = dice_num[0];
			dice_num3[2] = dice_num[2];
			dice_num3[3] = dice_num[3];
			dice_num3[4] = dice_num[5];
			dice_num3[5] = dice_num[1];
			dice_num[0] = dice_num3[0];
			dice_num[1] = dice_num3[1];
			dice_num[2] = dice_num3[2];
			dice_num[3] = dice_num3[3];
			dice_num[4] = dice_num3[4];
			dice_num[5] = dice_num3[5];
			}
			for(m = 0; m < 4; m++){
				if(dice_num[0] == dice_num2[0] && dice_num[1] == dice_num2[1] && dice_num[2] == dice_num2[2] && dice_num[3] == dice_num2[3] && dice_num[4] == dice_num2[4] && dice_num[5] == dice_num2[5])
					break;
				else{
					dice_num3[0] = dice_num[0];
					dice_num3[1] = dice_num[3];
					dice_num3[2] = dice_num[1];
					dice_num3[3] = dice_num[4];
					dice_num3[4] = dice_num[2];
					dice_num3[5] = dice_num[5];
					dice_num[0] = dice_num3[0];
					dice_num[1] = dice_num3[1];
					dice_num[2] = dice_num3[2];
					dice_num[3] = dice_num3[3];
					dice_num[4] = dice_num3[4];
					dice_num[5] = dice_num3[5];
			}
			}
		}
		if(dice_num[0] == dice_num2[0] && dice_num[1] == dice_num2[1] && dice_num[2] == dice_num2[2] && dice_num[3] == dice_num2[3] && dice_num[4] == dice_num2[4] && dice_num[5] == dice_num2[5]){
		}
		else{
		dice_num[0] = dice_num0[0];
		dice_num[1] = dice_num0[1];
		dice_num[2] = dice_num0[2];
		dice_num[3] = dice_num0[3];
		dice_num[4] = dice_num0[4];
		dice_num[5] = dice_num0[5];
		}
			for(i = 0; i < 4; i++){
				if(dice_num[0] == dice_num2[0] && dice_num[1] == dice_num2[1] && dice_num[2] == dice_num2[2] && dice_num[3] == dice_num2[3] && dice_num[4] == dice_num2[4] && dice_num[5] == dice_num2[5]){
					System.out.println("Yes");
				break;
				}
				else{
					dice_num3[0] = dice_num[4];
					dice_num3[1] = dice_num[0];
					dice_num3[2] = dice_num[2];
					dice_num3[3] = dice_num[3];
					dice_num3[4] = dice_num[5];
					dice_num3[5] = dice_num[1];
					dice_num[0] = dice_num3[0];
					dice_num[1] = dice_num3[1];
					dice_num[2] = dice_num3[2];
					dice_num[3] = dice_num3[3];
					dice_num[4] = dice_num3[4];
					dice_num[5] = dice_num3[5];
				}
				for(m = 0; m < 4; m++){
					if(dice_num[0] == dice_num2[0] && dice_num[1] == dice_num2[1] && dice_num[2] == dice_num2[2] && dice_num[3] == dice_num2[3] && dice_num[4] == dice_num2[4] && dice_num[5] == dice_num2[5])
						break;
					else{
						dice_num3[0] = dice_num[0];
						dice_num3[1] = dice_num[3];
						dice_num3[2] = dice_num[1];
						dice_num3[3] = dice_num[4];
						dice_num3[4] = dice_num[2];
						dice_num3[5] = dice_num[5];
						dice_num[0] = dice_num3[0];
						dice_num[1] = dice_num3[1];
						dice_num[2] = dice_num3[2];
						dice_num[3] = dice_num3[3];
						dice_num[4] = dice_num3[4];
						dice_num[5] = dice_num3[5];
				}
				}
				if(i == 3)
					System.out.println("No");
	}
	}

}