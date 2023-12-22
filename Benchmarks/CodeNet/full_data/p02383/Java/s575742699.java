
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//??????????????????????????????
		int top = sc.nextInt();
		int back = sc.nextInt();
		int right = sc.nextInt();
		int left = sc.nextInt();
		int front = sc.nextInt();
		int under = sc.nextInt();


		String strOrder = sc.next();

	//	System.out.println("strOrder : "+strOrder);
		String[] aryOrder = new String[strOrder.length()];

		//?????°??????
		Dice insDice = new Dice(top, under, left, right, front, back);

		for(int i = 0; i < strOrder.length(); i++) {
			aryOrder[i] = strOrder.substring(i, i+1);
		//	System.out.println(aryOrder[i]);
		}


		for(int i = 0; i < aryOrder.length; i++) {
			if(aryOrder[i].equals("N")) {
				insDice = insDice.northMove(insDice);
			}
			else if(aryOrder[i].equals("S")) {
				insDice = insDice.southMove(insDice);
			}
			else if(aryOrder[i].equals("W")) {
				insDice = insDice.westMove(insDice);
			}
			else if(aryOrder[i].equals("E")) {
				insDice = insDice.eastMove(insDice);
			}
		}

		System.out.println(insDice.getTopDice());

	//	System.out.println("??????");
	}
}
class Dice{
	//?????£?????????
	int top;
	int under;
	int left;
	int right;
	int front;
	int back;

	//?????°???????????????????????????
	public Dice(int top, int under, int left, int right, int front, int back){
		this.top = top;
		this.under = under;
		this.left = left;
		this.right = right;
		this.front = front;
		this.back = back;
	}
	//??????????????????????????????????????????
	public void findDice() {
		System.out.println("top : "+top);
		System.out.println("under : "+under);
		System.out.println("left : "+left);
		System.out.println("right : "+right);
		System.out.println("front : "+front);
		System.out.println("back : "+back);
	}
	//????????????????????¢??????????????????
	public Dice northMove(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = back1;
		insDice.under = front1;
		insDice.left = left1;
		insDice.right = right1;
		insDice.front = top1;
		insDice.back = under1;

		return insDice;
	}
	//????????????????????¢??????????????????
	public Dice southMove(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = front1;
		insDice.under = back1;
		insDice.left = left1;
		insDice.right = right1;
		insDice.front = under1;
		insDice.back = top1;

		return insDice;
	}
	//????????????????????¢??????????????????
	public Dice westMove(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = right1;
		insDice.under = left1;
		insDice.left = top1;
		insDice.right = under1;
		insDice.front = front1;
		insDice.back = back1;

		return insDice;
	}
	//????????????????????¢??????????????????
	public Dice eastMove(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = left1;
		insDice.under = right1;
		insDice.left = under1;
		insDice.right = top1;
		insDice.front = front1;
		insDice.back = back1;

		return insDice;
	}
	public int getTopDice() {
		return top;
	}
}