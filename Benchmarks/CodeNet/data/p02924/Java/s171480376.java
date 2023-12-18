import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> lst = new ArrayList<>();
        for (Long i = 0L; i < n; i++){
            lst.add (i + 1L);
        }
        Long ans = 0L;
        Long max = 0L;
        for (int i  = 0; i < n; i++) {
            Long soezi = i + 1L;
            Iterator<Long> it = lst.iterator();
            while (it.hasNext()) {
                Long l = it.next();
                max = Math.max(max, l % soezi);
            }
            ans += max;
        }
        System.out.println(ans);
    }
}
