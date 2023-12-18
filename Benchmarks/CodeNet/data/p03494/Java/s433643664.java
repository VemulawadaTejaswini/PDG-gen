import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ans = 50, n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int tmp = 0;
            while(x % 2 == 0){
                tmp++;
                x /= 2;
            }
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }
}