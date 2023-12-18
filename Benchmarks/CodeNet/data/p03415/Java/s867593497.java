import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> numList = new ArrayList<String>();
		for(int i = 0; i < 9 ; i++){
			String tmp = sc.next();
			numList.add(tmp);
		}
		System.out.println(numList.get(0) + numList.get(4) + numList.get(8));
		
	}
}