import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int N, cnt = 0;
		String hin;
		Scanner scan = new Scanner(System.in);
		N= scan.nextInt();
		List<String> name = new ArrayList<String>();
		
		for(int i = 1; i <= N; i++) {
			hin = scan.next();
			if(name.contains(hin)) {
			} else {
				name.add(hin);
				cnt++;
			}		
		}
		System.out.println(cnt);
	}

}