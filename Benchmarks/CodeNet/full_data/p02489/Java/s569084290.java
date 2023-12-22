import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int number, i=0;
		while(true){
			i++;
			number = sc.nextInt();
			
			if(number == 0) break;
			
			System.out.println("Case " + i + ": " + number);
		}
		
	}

}