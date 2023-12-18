import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        long x = a, y = b;
        for (int i = 0; i < a; i++)
            x = (x * 10 + a);
        for (int i = 0; i < b; i++)
            y = (y * 10 + b);
        System.out.printf("%d\n", Math.min(x, y));
        in.close();
    }
}
