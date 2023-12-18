import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        char ans = '1';
        char t;
        for(int i = 0; i < Math.min(k, s.length()); i++){
            if((t = s.charAt(i)) != '1'){
                ans = t;
                break;
            }
        }
        System.out.println(ans);
    }
}