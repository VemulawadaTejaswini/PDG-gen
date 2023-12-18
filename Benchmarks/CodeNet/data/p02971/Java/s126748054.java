import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            A.add(i, Integer.parseInt(scanner.nextLine()));
        }

        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            tmp = new ArrayList<>(A);
            tmp.remove(i);

            Collections.sort(tmp, Collections.reverseOrder());
            System.out.println(tmp.get(0));

        }

        scanner.close();

    }

}
