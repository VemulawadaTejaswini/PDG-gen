import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        Set<Integer> list = new HashSet<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        System.out.println(list.size() == 2 ? "Yes" : "No");
    }
}