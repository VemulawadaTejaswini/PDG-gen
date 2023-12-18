import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		int count = 0;
		for(int i = 0; i < n; i++) {
			a.add(sc.nextInt()-1);
		}
		for(int i = 0; i < a.size(); i++) {
			while(a.get(i) != i) {
				a.remove(i);
				count++;
				if(a.size()==0) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(count);
	}
}