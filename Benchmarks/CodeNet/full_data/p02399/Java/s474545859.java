

import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		//????????£?????????????????????
		Scanner sc = new Scanner(System.in);
		//a???????????????
		int a = sc.nextInt();
		//b???????????????
		int b = sc.nextInt();
		//a??b d(??´??°)
		int d = a / b;
		//a??b?????????r(??´??°)
		int r = a % b;
		//a??b f (???????°???°?????°)
		double f = (double) a / (double) b;
		//f??????????????´
		String ff = String.format("%.4f",f);
		//??¨???
		System.out.println(d + " " + r + " " + ff);
	}
}