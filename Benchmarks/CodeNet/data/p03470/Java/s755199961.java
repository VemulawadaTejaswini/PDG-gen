import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
    public static void main(String[] args) {

		Set<Integer> mochiSizeSet = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		int mochiNum = scan.nextInt();
        for (int i = 0; i < mochiNum; i++) {
			mochiSizeSet.add(scan.nextInt());
        }
        System.out.print(mochiSizeSet.size());
    }
}
