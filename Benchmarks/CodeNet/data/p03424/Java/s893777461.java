import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<String> list = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
        	list.add(scanner.next());
        }

        if (list.contains("P") && list.contains("W") && list.contains("G") && list.contains("Y")) {
        	System.out.println("Four");
        } else {
        	System.out.println("Three");
        }
	}

}