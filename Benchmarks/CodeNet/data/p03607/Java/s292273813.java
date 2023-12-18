import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            int k = sc.nextInt() - 1;
            a[i] = k;
            if(!m.containsKey(k)) m.put(k, 1);
            else m.put(k, m.get(k));
        }
        int ans = 0;
        for(int i = 0; i < 1000000000; i++)
            if(m.containsKey(i) && m.get(i) % 2 == 1) ans++;
        System.out.print(ans);
    }
}