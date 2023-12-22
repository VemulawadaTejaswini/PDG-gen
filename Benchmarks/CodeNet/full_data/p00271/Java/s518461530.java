import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int [] ondosa = {1,2,3,4,5,6,7};
	
	public void nyuryoku (){
		for(n = 0;n<= 6;n++){
		int saikou = sc.nextInt();
		int saitei = sc.nextInt();
		ondosa[n] = saikou - saitei;
	}
	}		
		public void syuturyoku(){
			for(n = 0;n <= 6;n++){
				System.out.println(ondosa[n]);
			}
		}
		


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main Main = new Main();
		Main.nyuryoku();
		Main.syuturyoku();

	}

}