import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Set<String> list = new HashSet<>();
        for (int i = 0; i < a; i++) list.add(sc.next());
        System.out.println(list.size());
    }
}
