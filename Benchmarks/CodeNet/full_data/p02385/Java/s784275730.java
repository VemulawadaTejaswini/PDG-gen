import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main dice1 = new Main(sc);
		Main dice2 = new Main(sc);

		int roll = 0;
		if(dice2.top == dice1.south || dice2.top == dice1.north || dice2.top == dice1.bottom) {
			while(dice2.top != dice1.top && roll <= 4) {
				dice1.goNorth();
				roll++;
			}
			roll = 0;
			while(dice2.bottom != dice1.bottom && roll <= 4) {
				dice1.goNorth();
				roll++;
			}
		} else if(dice2.top == dice1.west || dice2.top == dice1.east) {
			roll = 0;
			while(dice2.top != dice1.top && roll <= 4) {
				dice1.goEast();
				roll++;
			}
			roll = 0;
			while(dice2.bottom != dice1.bottom && roll <= 4) {
				dice1.goEast();
				roll++;
			}
		}

		if(dice2.south == dice1.east || dice2.south == dice1.west || dice2.south == dice1.north ) {
			roll = 0;
			while(dice2.south != dice1.south && roll <= 4) {
				dice1.spin();
				roll++;
			}
			roll = 0;
			while(dice2.north != dice1.north && roll <= 4) {
				dice1.spin();
				roll++;
			}
		}

		if(dice2.top == dice1.top && dice2.south == dice1.south && dice2.east == dice1.east && dice2.west == dice1.west && dice2.north == dice1.north && dice2.bottom == dice1.bottom) {
			System.out.println("Yes");
		}  else {
			System.out.println("No");
		}




	}

	//dice?????£?????????
	int top;
	int south;
	int east;
	int west;
	int north;
	int bottom;


	//?????????????????????
	public Main(Scanner sc) {
		this.top = sc.nextInt();
		this.south = sc.nextInt();
		this.east = sc.nextInt();
		this.west = sc.nextInt();
		this.north = sc.nextInt();
		this.bottom = sc.nextInt();
	}


	//??¢?????????????????? ?????£??????????????\????????????
	//N??´?????¢??????
	public void goNorth() {
		int t = this.top;
		int s = this.south;
		int n = this.north;
		int b = this.bottom;

		this.top = s;
		this.south = b;
		this.north = t;
		this.bottom = n;
	}

	//S??´?????¢??????
	public void goSouth() {
		int t = this.top;
		int s = this.south;
		int n = this.north;
		int b = this.bottom;

		this.top = n;
		this.south = t;
		this.north = b;
		this.bottom = s;
	}

	//E??´?????¢??????
	public void goEast() {
		int t = this.top;
		int e = this.east;
		int w = this.west;
		int b = this.bottom;

		this.top = w;
		this.east = t;
		this.west = b;
		this.bottom = e;
	}

	//W??´?????¢??????
	public void goWest() {
		int t = this.top;
		int e = this.east;
		int w = this.west;
		int b = this.bottom;

		this.top = e;
		this.east = b;
		this.west = t;
		this.bottom = w;
	}

	//dice????????¢??????
	public void spin() {
		int s = this.south;
		int e = this.east;
		int w = this.west;
		int n = this.north;


		this.south = w;
		this.east = s;
		this.west = n;
		this.north = e;

	}

}