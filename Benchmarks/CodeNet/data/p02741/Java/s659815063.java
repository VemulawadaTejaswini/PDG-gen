
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
 
        //System.out.println(str);
        scan.close();
        
		int[] dataArr = new int[] {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
		
		System.out.println(dataArr[Integer.parseInt(str,10)-1]);
	}

}
