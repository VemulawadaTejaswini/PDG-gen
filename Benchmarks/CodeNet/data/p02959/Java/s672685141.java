import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> monster = new ArrayList<>();
		ArrayList<Integer> braver = new ArrayList<>();
		long count = 0;
		for (int i = 0; i < n + 1; i++) {
			monster.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			braver.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			int  sub=Math.min(monster.get(i), braver.get(i));
			monster.add(i,monster.get(i)-sub);
			braver.add(i,braver.get(i)-sub);
			count+=sub;
			sub=Math.min(monster.get(i+1),braver.get(i));
			count+=sub;
			monster.add(i,monster.get(i)-sub);
			braver.add(i,braver.get(i)-sub);

		}
		System.out.println(count);
	}
}
