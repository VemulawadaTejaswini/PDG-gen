import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=100-scan.nextInt();//TURNでプレイヤーが勝つ確率
		int pasent=0;
		int win=0;//プレイヤーが勝つ回数
		double nanikayokuwakaran=100/(b+c);
		int pasentchoku=(int) (b*nanikayokuwakaran);
		//プレイヤーが勝つを100%としたときにchokudaiか勝つ確率
		int pasentao=100-pasentchoku;
		int winch=0;
		int winao=0;
		int ans=0;
		for(;;) {
			ans++;
			pasent+=d;
			win=pasent/100;
			winch=win*pasentchoku/100;
			winao=win*pasentao/100;
			if(winch>=a||winao>=a) {
				break;
			}
		}
		System.out.println(ans);
	}
}
