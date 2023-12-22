import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> HeightDAO = new ArrayList<>();

		for(int i = 0 ; i < N; i++) {
			HeightDAO.add(sc.nextInt());
		}

		sc.close();

		int answer = 0;

		for(int a = 1; a <= HeightDAO.size(); a++) {
			for(int b = a+1; b <= HeightDAO.size(); b++) {
/*
				System.out.println(a + " " +b);
				System.out.println(a-b);
				System.out.println(HeightDAO.get(a-1) + HeightDAO.get(b-1));
*/
				if(b-a == HeightDAO.get(a-1) + HeightDAO.get(b-1) ) {
					answer++;
				}
			}
		}

		System.out.println(answer);
	}

}
