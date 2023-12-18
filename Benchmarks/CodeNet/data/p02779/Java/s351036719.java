import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> list = new ArrayList<Long>(Arrays.asList(0l));
		boolean check = true;
		int N = sc.nextInt();
		int i = 1;
		while(check) {
			long l = sc.nextLong();
			if(list.contains(l)) {
				check = false;
			}else{
				list.add(l);
				if(i==N) {
					check = false;
				}
				i++;
			}
		}

		if(list.size() == N+1)System.out.println("Yes");
		else System.out.println("No");
		System.exit(0);
	}
}