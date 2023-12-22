import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<String> ary = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            ary.add(sc.next());
        }
        List<String> list = new ArrayList<String>(new HashSet<>(ary));
        System.out.print(list.size());
    }
}

