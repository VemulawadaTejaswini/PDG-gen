import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int days = Integer.parseInt(sc.next());
        int nokori = Integer.parseInt(sc.next());
        int sum = 0;
        for (int i = 0; i < n; i++ ){
            int between = Integer.parseInt(sc.next());
            for (int j = 1; j <= days; j += between) {
                sum += 1;
            }
        }
        System.out.println(sum + nokori);
    }
}