import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(0));
		for(int i = 0; i < N; i++) {
			int l = sc.nextInt();
			if(!list.contains(l)) {
				list.add(l);
			}else{
				break;
			}
		}
		if(list.size() == N+1)System.out.println("YES");
		else System.out.println("NO");
	}
}