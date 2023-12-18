import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p = 0, q = 0, r= 0;
        for(int i = sc.nextInt(); i > 0; i--)
            switch(sc.nextInt() % 4){
                case 0: p++; break;
                case 2: q++; break;
                case 1:
                case 3: r++; break;
                default: break;
            }
        String ans = (p < r) ? "No" : "Yes";
        System.out.println(ans);
    }
}