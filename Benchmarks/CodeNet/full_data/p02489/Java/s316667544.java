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
			if(!sc.hasNext()) break;
			
			i++;
			number = sc.nextInt();
			System.out.println("Case " + i + ":" + number);
		}
		
	}

}