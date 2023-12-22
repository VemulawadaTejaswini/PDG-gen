import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        HashSet<String>set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String str = s.next();
            set.add(str);
        }

        System.out.println(set.size());
    }
}