import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> prog = new ArrayList<>();

		int num = sc.nextInt();
		prog.add(num);
		int temp = num;

		for(int i = 1; i < n; i++) {
			num = sc.nextInt();
			if(num != temp) {
				prog.add(num);
			}
			temp = num;
		}

		for(int i = 0; i < prog.size(); i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(prog.get(i));
		}
		System.out.println();
	}

}
