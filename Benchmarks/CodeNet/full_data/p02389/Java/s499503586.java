import java.util.Scanner;

class Main{
	static public void main (String args[]){
		Scanner scan = new Scanner(System.in);
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();

		int area = 0; //??¢???
		int around = 0; //??¨?????????

		area = val1*val2;
		around = (val1 + val2)*2;
		System.out.print(area+" "+around);
	}
}