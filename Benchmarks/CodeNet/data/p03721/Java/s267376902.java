import java.util.*;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            int nCopies = scanner.nextInt();
            list.addAll(Collections.nCopies(nCopies, number));
        }
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
}
