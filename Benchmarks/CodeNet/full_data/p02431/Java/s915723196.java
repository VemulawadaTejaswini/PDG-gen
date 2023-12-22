package icpc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int com = sc.nextInt();
			switch(com) {
			case 0:
				int x = sc.nextInt();
				a.add(x);
				break;
			case 1:
				x = sc.nextInt();
				System.out.println(a.get(x));
				break;
			case 2:
				a.remove(a.size()-1);
				break;
			}
		}
	}
}


