import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int [] a = new int [n]; HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        map.put((long) a[0], (long) 1); long ans = 0;
        for (long i = 1; i < n; i++) {
            ans += map.getOrDefault(i - a[(int)i], (long)0);
            map.put(i + a[(int) i], map.getOrDefault(i + a[(int) i], (long)0) + 1);
        }
        System.out.println(ans);
    }


}