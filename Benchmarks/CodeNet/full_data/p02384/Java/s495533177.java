import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] dice_num;
		dice_num = new int[10];
		int[] dice_s,dice_p;
		dice_s = new int[10];
		dice_p = new int[10];
		int i;
		for(i = 0; i < 6; i++)
			dice_num[i] = scan.nextInt();
		int n = scan.nextInt();
		for(i = 0; i < n; i++){
			int dice1 = scan.nextInt();
			int dice2 = scan.nextInt();
			for(;;){
				if(dice_num[0] == dice1)
					break;
				else{
					dice_s[0] = dice_num[4];
					dice_s[1] = dice_num[0];
					dice_s[2] = dice_num[2];
					dice_s[3] = dice_num[3];
					dice_s[4] = dice_num[5];
					dice_s[5] = dice_num[1];
					dice_num[0] = dice_s[0];
					dice_num[1] = dice_s[1];
					dice_num[2] = dice_s[2];
					dice_num[3] = dice_s[3];
					dice_num[4] = dice_s[4];
					dice_num[5] = dice_s[5];
 				}
			}
			for(;;){
				if(dice_num[1] == dice2)
					break;
				else{
					dice_p[0] = dice_num[0];
					dice_p[1] = dice_num[3];
					dice_p[2] = dice_num[1];
					dice_p[3] = dice_num[4];
					dice_p[4] = dice_num[2];
					dice_p[5] = dice_num[5];
					dice_num[0] = dice_p[0];
					dice_num[1] = dice_p[1];
					dice_num[2] = dice_p[2];
					dice_num[3] = dice_p[3];
					dice_num[4] = dice_p[4];
					dice_num[5] = dice_p[5];
				}
			}
				System.out.println(dice_num[2]);
		}
	}
}