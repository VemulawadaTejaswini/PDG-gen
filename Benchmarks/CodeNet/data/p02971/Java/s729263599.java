import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            A.add(i, Integer.parseInt(scanner.nextLine()));
        }

        List<Integer> sorted = new ArrayList<>(A);
        Collections.sort(sorted, Collections.reverseOrder());
        List<Integer> tmp = new ArrayList();

        for (int i = 0; i < N; i++) {

            tmp = new ArrayList<>(sorted);
            tmp.remove(A.get(i));
            System.out.println(tmp.get(0));

        }

        scanner.close();

    }

}
