import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int p = 0, q = 0, r= 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x % 4 == 0) a[i] = 2;
            else if(x % 2 == 0) a[i] = 1;
            else a[i] = 0;
            switch(a[i]){
                case 0: p++; break;
                case 1: q++; break;
                case 2: r++; break;
                default: break;
            }
        }
        String ans = "Yes";
        int b = Math.min(q, r * 2 - p);
        if(r * 2 - p < 0 ||(r * 2 - p ==  0 && q > 0)) ans = "No";
        System.out.println(ans);
    }
}