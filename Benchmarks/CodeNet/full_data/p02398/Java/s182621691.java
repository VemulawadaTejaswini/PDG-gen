
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		//????????£?????????????????????
		Scanner sc = new Scanner(System.in);
		//?????°?????£?¨?
		int num = 0;
		
		//a?????????
		int a = sc.nextInt();
		//b?????????
		int b = sc.nextInt();
		//c?????????
		int c = sc.nextInt();
		//??°????????? a???b????????????????????????????????????
		for(int i = a; i < b; i++){
			//?????¶???c???i??§?????£?????°???0????????°
			if(c % i == 0){
				//?????¶????????£?§£??????????????????
				num++;
			}
		}
		//??¨???
		System.out.println(num);
	}
}