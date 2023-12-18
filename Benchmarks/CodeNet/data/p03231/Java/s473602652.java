import java.util.*;
class Main
{
    static int MOD = 23;//998244353;
 
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String s = sc.next(), t = sc.next();

        Map<Integer, Character> ms = new HashMap<>();
        Map<Integer, Character> mt = new HashMap<>();
        int l = calc(n, m);
        for(int i = 0; i < l; i++){
            ms.put(i, null);
            mt.put(i, null);
        }
        for(int i = 0; i < n; i++){
            ms.put(i * l / n, s.charAt(i));     
        }
        for(int i = 0; i < m; i++){
            mt.put(i * l / m, t.charAt(i));     
        }
        boolean bl = true;
        for(int i = 0; i < l; i++)
        {
            if(ms.get(i) != null && mt.get(i) != null && ms.get(i) != mt.get(i)){
                bl = false;
                System.out.println(-1);
                break;
            }
        }
        if(bl){
            System.out.println(l);
        }
    }
    static int calc (int n, int m)
    {
        int x = Math.min(n, m);
        int y = Math.max(n, m);
        for(int i = 1; i < x;i++)
        {
            if(y * i % x == 0){
                return y * i;
            }
        }
        return y * x;
    }
 }