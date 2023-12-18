import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Long> numList = new ArrayList<>();
		boolean hasSame = false;
		
		for(int i = 0; i < n; i++) {
			long num = sc.nextLong();
			if(numList.contains(num)) {
				hasSame = true;
				break;
			}else {
				numList.add(num);
			}
		}
		
		System.out.println(hasSame ? "NO" : "YES");
		sc.close();
	}

}