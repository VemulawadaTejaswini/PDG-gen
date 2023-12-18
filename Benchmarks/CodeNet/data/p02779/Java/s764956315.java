import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<Integer> list = new HashSet<Integer>();
		list.add(0);
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