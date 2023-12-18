import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int A,B;
        int AA= 0;
        for (A = 0; A <= 64; A++) {
            AA = (int) Math.pow(A, 5);
            if(AA+1==X){
                System.out.println(A+" -1");
            }
        }
    }
}