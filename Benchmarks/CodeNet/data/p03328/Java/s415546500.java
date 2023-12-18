import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sa = b-a;
        int t = 1;
        int x = 0;
        
        for(int i=2;i<sa;i++){
            t += i;
        }
        
        x = t - a;
        
        System.out.println(x);
    }
}
