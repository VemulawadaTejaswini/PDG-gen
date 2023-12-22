import java.util.Scanner;

class Dice{
	int pip_top;
	int pip_front;
	int pip_right;
	int pip_left;
	int pip_back;
	int pip_bottom;
}

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		Dice d1= new Dice();

		d1.pip_top=sc.nextInt();
		d1.pip_front=sc.nextInt();
		d1.pip_right=sc.nextInt();
		d1.pip_left=sc.nextInt();
		d1.pip_back=sc.nextInt();
		d1.pip_bottom=sc.nextInt();

		int q=sc.nextInt();

		for(int i = 0; i < q; i++) {

			int pip1=sc.nextInt();
			int pip2=sc.nextInt();

			if(pip1==d1.pip_top)
				top_right(d1,pip2);
			else if(pip1==d1.pip_right)
				right_right(d1,pip2);
			else if(pip1==d1.pip_front)
				front_right(d1,pip2);
			else if(pip1==d1.pip_left)
				left_right(d1,pip2);
			else if(pip1==d1.pip_back)
				back_right(d1,pip2);
			else
				bottom_right(d1,pip2);
		}
	}

	private static void top_right(Dice d1,int p2) {
		if(p2==d1.pip_front)
			System.out.println(d1.pip_right);
		else if(p2==d1.pip_right)
			System.out.println(d1.pip_back);
		else if(p2==d1.pip_back)
			System.out.println(d1.pip_left);
		else
			System.out.println(d1.pip_front);
	}

	private static void right_right(Dice d1,int p2) {
		if(p2==d1.pip_front)
			System.out.println(d1.pip_bottom);
		else if(p2==d1.pip_bottom)
			System.out.println(d1.pip_back);
		else if(p2==d1.pip_back)
			System.out.println(d1.pip_top);
		else
			System.out.println(d1.pip_front);
	}

	private static void front_right(Dice d1,int p2) {
		if(p2==d1.pip_left)
			System.out.println(d1.pip_bottom);
		else if(p2==d1.pip_bottom)
			System.out.println(d1.pip_right);
		else if(p2==d1.pip_right)
			System.out.println(d1.pip_top);
		else
			System.out.println(d1.pip_left);
	}

	private static void left_right(Dice d1,int p2) {
		if(p2==d1.pip_front)
			System.out.println(d1.pip_top);
		else if(p2==d1.pip_top)
			System.out.println(d1.pip_back);
		else if(p2==d1.pip_back)
			System.out.println(d1.pip_bottom);
		else
			System.out.println(d1.pip_front);
	}

	private static void back_right(Dice d1,int p2) {
		if(p2==d1.pip_top)
			System.out.println(d1.pip_right);
		else if(p2==d1.pip_right)
			System.out.println(d1.pip_bottom);
		else if(p2==d1.pip_bottom)
			System.out.println(d1.pip_left);
		else
			System.out.println(d1.pip_top);
	}

	private static void bottom_right(Dice d1,int p2) {
		if(p2==d1.pip_front)
			System.out.println(d1.pip_left);
		else if(p2==d1.pip_left)
			System.out.println(d1.pip_back);
		else if(p2==d1.pip_back)
			System.out.println(d1.pip_right);
		else
			System.out.println(d1.pip_front);
	}


}
