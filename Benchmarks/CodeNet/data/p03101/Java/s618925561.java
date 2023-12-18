import java.util.*;
 
public class a0125 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
 
        int result = (H-h)*(W-w);
        System.out.println(result);
        sc.close();
    }
}