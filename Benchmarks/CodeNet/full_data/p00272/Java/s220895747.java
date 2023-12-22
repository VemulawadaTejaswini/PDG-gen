import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int t;
	int n;
	int kingaku;
	int tanka;
	
	public void kei(){
		t = sc.nextInt();
		n = sc.nextInt();
		switch(t){
		case 1:tanka = 6000; 
		       break;
		case 2:tanka = 4000;
		       break;
		case 3:tanka = 3000;
		       break;
		case 4:tanka = 2000;
		       break;
		}
	}
	
	public void hyouji(){
		kingaku = tanka * n;
		System.out.println(kingaku);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main go = new Main();
		go.kei();
		go.hyouji();
	}

}