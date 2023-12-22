import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		boolean check = true;
		Integer temp;
		while(check) {
			temp = scan.nextInt();
			if(temp.equals(0)) {
				check = false;
			}else {
				list.add(temp);
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Case" + " " + (i + 1) + ": " + list.get(i));
		}
		
	}

}

