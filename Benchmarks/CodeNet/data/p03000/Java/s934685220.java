import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.next());
        int max = Integer.parseInt(sc.next());
        int res = 0;
        int count = 1;
        for(int x=1; x<=total;x++) {
            res += Integer.parseInt(sc.next());
            if (res > max) {
                System.out.println(count);
                return;
            }
            count++;
        }
        System.out.println(count);
    }
}
