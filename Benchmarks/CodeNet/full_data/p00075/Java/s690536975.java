import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String in = sc.nextLine();
			String[] ins = in.split(",");
			
			int num = Integer.parseInt(ins[0]);
			double wei = Double.parseDouble(ins[1]);
			double hei = Double.parseDouble(ins[2]);
			 
			if(25.0 <= wei/(hei*hei)){
				System.out.println(num);
			}
		}
	}
}