import java.util.*;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int n2 = Math.max(n-2,0);
        int m2 = Math.max(m-2,0);

        out.print(n2*m2);
    }
}