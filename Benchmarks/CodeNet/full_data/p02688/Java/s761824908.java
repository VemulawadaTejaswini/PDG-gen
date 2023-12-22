import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int human = sc.nextInt();
		int okashi = sc.nextInt();
		int cnt = 0;

		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 1; i <= human; i++){
			list.add(i);
		}

		for(int i = 0; i < okashi; i++){
			cnt = sc.nextInt();
			for(int j = 0; j < cnt; j++){
				list.remove((Object)sc.nextInt());
			}
		}

		System.out.println(list.size());

		sc.close();
	}
}