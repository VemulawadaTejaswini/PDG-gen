
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();

		//??????????????????????????????
		int top = sc.nextInt();
		int back = sc.nextInt();
		int right = sc.nextInt();
		int left = sc.nextInt();
		int front = sc.nextInt();
		int under = sc.nextInt();
		int Count = sc.nextInt();

		boolean isOk = false;
		boolean isOk1 = false;

		//?????????northMove??¨eastMove?????°?????????(isOk???true??????????????§)
		boolean isOk2 = true;

		//?????°??????
		Dice insDice = new Dice(top, under, left, right, front, back);

		for(int i = 0; i < Count; i++) {
			int OrderTop = sc.nextInt();
			int OrderBack = sc.nextInt();


			while(!isOk1) {
				while(!isOk) {
					if(isOk2) {
						insDice = insDice.northMove(insDice);
						isOk2 = false;
					}
					else if(!isOk2) {
						insDice = insDice.eastMove(insDice);
						isOk2 = true;
					}
					if(OrderTop == insDice.getTopDice()) {
						isOk = true;
					}
				}
				insDice = insDice.anticlockwise(insDice);
				if(OrderBack == insDice.getBackDice()) {
					isOk1 = true;
				}
			}
			list.add(insDice.getRightDice());
			isOk = false;
			isOk1 = false;
			isOk2 = true;
		}

		for(Integer i : list) {
			System.out.println(i);
		}
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
	public Dice anticlockwise(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = top;
		insDice.under = under;
		insDice.left = front1;
		insDice.right = back1;
		insDice.front = right1;
		insDice.back = left1;


		return insDice;
	}

	public int getTopDice() {
		return top;
	}
	public int getBackDice() {
		return back;
	}
	public int getRightDice() {
		return right;
	}
}