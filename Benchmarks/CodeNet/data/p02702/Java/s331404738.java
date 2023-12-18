import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); int [] a = new int [s.length()]; int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            a[i] = Integer.parseInt(s.substring(i, i+1));
        }
        Map<Integer, Integer> stor = new HashMap<>(); int cur = 0;
        stor.put(0, 1); long ans = 0; int cur10 = 1;
        for (int i = n-1; i >= 0; i--) {
            cur = (a[i] * cur10 + cur) % 2019;
            cur10 = (cur10 * 10) % 2019;
            stor.put(cur, stor.getOrDefault(cur, 0) + 1);
            if (stor.get(cur) >= 2) {
                ans += stor.get(cur) - 1;
            }
        }
        System.out.println(ans);
    }




}