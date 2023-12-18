import java.util.*;
public class Haiku {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();

        int B = s.nextInt();

        int C = s.nextInt();

        int D = s.nextInt();

        while(true) {
            C= C-B;
            A = A-D;
            if(C <= 0) {
                System.out.println("Yes");
                break;
            }
            if(A <= 0) {
                System.out.println("No");
                break;
            } 
        }
    }
}