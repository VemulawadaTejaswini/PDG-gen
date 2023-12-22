import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Main {
	static int[] dice;
	static int a;
	static int b;
	static int c;
	static int d;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		dice = new int[6];
		for(int i=0; i<6; i++) {
			dice[i] = sc.nextInt();
		}

		int o = sc.nextInt();
		for(int i=0; i<o; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			while(true) {
				diceRoll();
				if(dice[0]==a && dice[1]==b) {
					System.out.println(dice[2]);
					break;
				}
			}
		}

		sc.close();
	}

	public static void diceRoll() {
		Random rand = new Random();
		int num = rand.nextInt(4);
		if(num==0) {
			s();
		}else if(num==1) {
			n();
		}else if(num==2) {
			w();
		}else if(num==3){
			e();
		}
	}

	public static void s() {
		a = dice[0];
		b = dice[1];
		c = dice[4];
		d = dice[5];

		dice[0] = c;
		dice[1] = a;
		dice[4] = d;
		dice[5] = b;
	}

	public static void w() {
		a = dice[0];
		b = dice[2];
		c = dice[3];
		d = dice[5];

		dice[0] = b;
		dice[2] = d;
		dice[3] = a;
		dice[5] = c;
	}

	public static void e() {
		a = dice[0];
		b = dice[2];
		c = dice[3];
		d = dice[5];

		dice[0] = c;
		dice[2] = a;
		dice[3] = d;
		dice[5] = b;
	}

	public static void n() {
		a = dice[0];
		b = dice[1];
		c = dice[4];
		d = dice[5];

		dice[0] = b;
		dice[1] = d;
		dice[4] = a;
		dice[5] = c;
	}
}
