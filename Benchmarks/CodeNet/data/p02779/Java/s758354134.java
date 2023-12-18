import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> value = new ArrayList<Integer>();

		for(int i=0 ; i<num ; i++) {
			int a = sc.nextInt();

			if(value.contains(a)) {
				System.out.print("NO");
				return;
			}
			else {
				value.add(a);
				continue;
			}
		}
		System.out.print("YES");
		sc.close();
	}
}
