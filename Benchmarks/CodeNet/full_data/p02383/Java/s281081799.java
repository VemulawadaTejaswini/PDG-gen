
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice d = new Dice();
		for(int i = 0; i < 6; i++) {
			d.side[i] = sc.nextInt();
		}
		String cmd = sc.next();
		for(int i = 0; i < cmd.length(); i++) {
			switch(cmd.charAt(i)) {
				case 'E':{
					d.rollE();
					break;
				}
				case 'W':{
					d.rollW();
					break;
				}
				case 'S':{
					d.rollS();
					break;
				}
				case 'N':{
					d.rollN();
					break;
				}
			}
		}
		d.getUpperSide();
		sc.close();
	}
}

class Dice {
	int[] side = new int[6];

	public void getUpperSide() {
		System.out.println(this.side[0]);
	}

	public void rollE() {
		int w = this.side[5];
		this.side[5] = this.side[2];
		this.side[2] = this.side[0];
		this.side[0] = this.side[3];
		this.side[3] = w;
	}
	public void rollW() {
		int w = this.side[5];
		this.side[5] = this.side[3];
		this.side[3] = this.side[0];
		this.side[0] = this.side[2];
		this.side[2] = w;
	}
	public void rollN() {
		int w = this.side[5];
		this.side[5] = this.side[4];
		this.side[4] = this.side[0];
		this.side[0] = this.side[1];
		this.side[1] = w;
	}
	public void rollS() {
		int w = this.side[5];
		this.side[5] = this.side[1];
		this.side[1] = this.side[0];
		this.side[0] = this.side[4];
		this.side[4] = w;
	}
}

