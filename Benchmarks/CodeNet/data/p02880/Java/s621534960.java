import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		ArrayList<Integer> multiArray = new ArrayList<>();
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				multiArray.add(i * j);
			}
		}
		if(multiArray.contains(N)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}