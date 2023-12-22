import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		HashSet<Integer> list = new HashSet<Integer>();

		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			if(a == 0) {
				list.add(b);
				System.out.println(list.size());

			}else if(a == 1){
				System.out.println(list.contains(b) ? "1" : "0");
			
			}else if(a == 2) {
				
				list.remove(b);
				
			}
		}
	}
}
