import java.util.*;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String> first = new LinkedList<>(Arrays.asList(sc.next().split("")));
        for (int i = 1; i < n; i++) {
            List<String> copy = (LinkedList<String>)first.clone();
            List<String> other = new LinkedList<>(Arrays.asList(sc.next().split("")));
            for (String s: copy
                 ) {
                if (other.contains(s)) {
                    other.remove(s);
                } else {
                    first.remove(s);
                }
            }
        }
        Collections.sort(first);
        StringBuilder builder = new StringBuilder();
        for (String s: first
             ) {
            builder.append(s);
        }
        System.out.println(builder);
    }
}