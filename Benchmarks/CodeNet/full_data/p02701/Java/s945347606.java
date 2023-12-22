import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		List<String> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			String s= sc.next();
			if(!list.contains(s)) {
				list.add(s);
			}
		}
		long ans = list.stream().count();
		System.out.println(ans);
	}

}