import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        List<Long> list = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            long temp = kbd.nextLong();
            if (list.contains(temp)) {
                list.remove(temp);
            } else {
                list.add(temp);
            }
        }
        System.out.println(list.size());
    }
}