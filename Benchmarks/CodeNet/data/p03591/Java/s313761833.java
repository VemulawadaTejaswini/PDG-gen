import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if(m*i+n*j-i*j*2==k){
                    out.println("Yes");
                    exit(0);
                }
            }
        }
        out.println("No");
    }
}