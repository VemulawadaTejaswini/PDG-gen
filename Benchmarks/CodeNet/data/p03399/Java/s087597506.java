import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();
        
        int De=Math.min(A,B);
        int Bu=Math.min(C,D);
        
        System.out.println(De+Bu);
    }
}