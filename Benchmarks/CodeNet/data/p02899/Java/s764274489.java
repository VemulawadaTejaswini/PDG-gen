
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> A = new HashMap<Integer, Integer>();

		for (int i = 1; i < N + 1; i++) {
			A.put(sc.nextInt(), i);
		}

        Object[] mapkey = A.keySet().toArray();
        Arrays.sort(mapkey);

        for (Integer nKey : A.keySet())
        {
            System.out.println(A.get(nKey));
        }

	}
}
