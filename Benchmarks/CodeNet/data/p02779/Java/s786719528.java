import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < N; i++) ts.add(Integer.parseInt(scanner.next()));

        if(N == ts.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
