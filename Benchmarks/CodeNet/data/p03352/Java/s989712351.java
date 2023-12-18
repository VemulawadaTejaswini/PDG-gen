import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();


        // べき乗数のリストをつくる
		Set<Integer> set = new HashSet<>();

		set.add(1);

		for (int i = 2; i < 32; i++) {
			for (int j = 2; j < 10; j++) {
				set.add((int)Math.pow(i, j));
			}
		}

		for(int i = 0; i < X; i++) {
			if (set.contains(X-i)) {
				System.out.println(X-i);
				return;
			}
		}
    }
}
