import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = 0;
        for(int i = a; i <= b; i++){
            int v = i % 10;
            int w = (i - v) / 10 % 10;
            int x = (i - w - v)  / 100 % 10;
            int y = (i - x - w - v) / 1000 % 10;
            int z = (i - y - x - w - v) / 10000 % 10;
            if(v == z && w == y) ans++;
        }
        System.out.println(ans);
    }
}