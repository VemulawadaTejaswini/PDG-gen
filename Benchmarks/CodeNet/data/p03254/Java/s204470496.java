import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		List<Integer> list = new ArrayList<>();


		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			list.add(a);
		}

		Collections.sort(list);

		int cnt = 0;

		for(int i : list) {
            X -= i;

            if(X < 0) {
            	break;
            }else {
            	cnt++;
            }
        }

		System.out.print(cnt);
		sc.close();
	}

}
