import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> list = new ArrayList<>();
        long sum = 0;
        for (long i = 0; i < n; i++) {
            list.add( sc.nextLong());
        }
        Collections.sort(list, Collections.reverseOrder());
        for (long i = 0; i < n - 1; i++)
            sum += list.get((int) i);
        System.out.println(sum);
    }
}