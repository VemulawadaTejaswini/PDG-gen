import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int x = sc.nextInt();
                sc.close();
                if(a <= x && a + b >= x) System.out.println("YES");
                else System.out.println("NO");
        }
}