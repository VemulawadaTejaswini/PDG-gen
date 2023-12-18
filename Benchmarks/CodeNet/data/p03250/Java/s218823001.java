import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		
		int maxNum;
		int minNum;
		if(a > b){
			maxNum = a;
			minNum = b;
		} else {
			maxNum = b;
			minNum = a;
		}
		
		int result;
		if(maxNum > c){
			result = maxNum * 10 + minNum + c;
		} else {
			result = c * 10 + maxNum + minNum;
		}
		scan.close();
		
		System.out.print(result);
	}
}