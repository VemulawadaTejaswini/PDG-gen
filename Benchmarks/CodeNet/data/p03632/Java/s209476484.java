package contest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        
        if((a >= 0 && a <= 100) && (b >= 0 && b <= 100) && (c >= 0 && c <= 100) && (d >= 0 && d <= 100)){
            if((c > b) || (a > d))
                System.out.println(0);
            else
                if(a < c)
                    if(d < b)
                        System.out.println(d - c);
                    else
                        System.out.println((b - a) - (c - a));
                else
                    if(b < d)
                        System.out.println(b - a);
                    else
                        System.out.println((d - c) - (a - c));
        }
    }
}
