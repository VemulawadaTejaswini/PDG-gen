import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		//??????????????°??????
		int n = scan.nextInt();
		String strTcard = "";
		String strHcard = "";
		int Tscore = 0;
		int Hscore = 0;

		for(int i = 0; i < n; i++){

			strTcard = scan.next();
			strHcard = scan.next();
			//????????????????????°????????????
			int pointT = strTcard.charAt(0);
			int pointH = strHcard.charAt(0);
			//System.out.println("i:" + i);
			//System.out.println("pointT:" + pointT);
			//System.out.println("pointH:" + pointH);

			if(pointT == pointH){
				Tscore += 1;
				Hscore += 1;
			}else if(pointT < pointH){
				Hscore += 3;
			}else{
				Tscore += 3;
			}
			//System.out.println();
			//System.out.println("Tscore:" + Tscore);
			//System.out.println("Hscore:" + Hscore);

		}
		scan.close();
		System.out.println(Tscore + " " + Hscore);
	}
}