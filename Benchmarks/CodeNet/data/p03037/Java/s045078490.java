import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		ArrayList<Integer> checker = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < M; i++){
			int L = scan.nextInt();
			int R = scan.nextInt();
			if (i == 0){
				for (int j = L; j < R + 1; j++){
					checker.add(j);
				}
			}else {
				for (int j = L; j < R + 1; j++){
					if (checker.contains(j))
					list.add(j);
				}
			}

		}

		System.out.println(list.size());

	}
}