import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> list = new ArrayList<>();
        
        for (long i = 0; i < n; i++) {
            list.add( sc.nextLong());
        }
        Collections.sort(list, Collections.reverseOrder());
        long sum = list.get(0);
        for (int i = 1; i < n/2; i++)
           sum+=list.get(i) * 2;
        System.out.println(sum);
    }
}