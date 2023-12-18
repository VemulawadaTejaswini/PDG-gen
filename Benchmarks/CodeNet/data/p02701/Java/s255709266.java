import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> priseList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			String prise = sc.next();
			if(!priseList.contains(prise)) {
				priseList.add(prise);
			}
		}

		System.out.println(priseList.size());
		sc.close();
	}

}