
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int A = sc.nextInt(), V = sc.nextInt(), B = sc.nextInt(), W = sc.nextInt(), T = sc.nextInt();
        int diff = Math.abs(B - A);
        int reach = V - W;
        if(reach > 0 && (long)diff <= (long)reach * (long)T){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
