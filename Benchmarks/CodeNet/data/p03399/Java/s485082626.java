import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] agrs){
        long A, B, C, D;
        long ans;
        while(sc.hasNext()){
            ans = 0;
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();
            ans = ((B + C) < (B + D) ? (B + C) : (B + D)) < ((A + C) < (A + D) ? (A + C) : (A + D)) ? ((B + C) < (B + D) ? (B + C) : (B + D)) : ((A + C) < (A + D) ? (A + C) : (A + D));
            System.out.println(ans);
        }
    }
}
