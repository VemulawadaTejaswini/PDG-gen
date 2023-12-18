package atCoder;
 
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int dislikeNumsCount = sc.nextInt();
      
		String dislikeNums = null ;
		int dislikeNum = sc.nextInt();
		dislikeNums += dislikeNum;
		for (int i = 0; i < dislikeNumsCount-1; i++) {
			dislikeNum = sc.nextInt();
			dislikeNums += "||"+dislikeNum;
		}
		dislikeNums = "["+dislikeNums+"]";
		int compare = price;
		String compareStr = String.valueOf(compare);
		while (compare >= price) {
				if (compareStr.contains(dislikeNums)) {
					compare++;
				} else {
					break;
				}
			}
		int payment = Integer.parseInt(compareStr);
		System.out.println(payment);
	}
}