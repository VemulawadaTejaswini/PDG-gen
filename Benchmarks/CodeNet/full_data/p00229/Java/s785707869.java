import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int coin=100;
			int b = cin.nextInt();
			int r = cin.nextInt();
			int g = cin.nextInt();
			int c = cin.nextInt();
			int s = cin.nextInt();
			int t = cin.nextInt();
			if(b+r+g+c+s+t==0){
				break;
			}
			t = t-b*5-r*3;
			int bonusGame=b*5+r*3;
			for(int i =0; i < bonusGame;i++){
				coin+=13;
			}
			for(int i = 0; i < b;i++){
				coin+=12;
			}
			for(int i = 0; i < r;i++){
				coin+=12;
			}
			for(int i = 0; i < g;i++){
				coin+=4;
			}
			for(int i = 0; i < c;i++){
				coin-=1;
			}
			t = t-b-r-g-c-s;
			coin -= t*3;
			System.out.println(coin);
		}
	}

}