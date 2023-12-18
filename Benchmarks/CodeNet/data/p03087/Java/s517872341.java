import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		String s = sc.next();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < q; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			String str = s.substring(j-1,k);
			
			list.add(str.split("AC",-1).length - 1);
		}
		
		for(int i : list) {
			System.out.println(i);
		}

	}
}