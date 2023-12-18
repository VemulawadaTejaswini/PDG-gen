import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int n = sc.nextInt();
                int a = sc.nextInt();
                if(n % 500 > a) System.out.println("No");
                else System.out.println("Yes");
        }
}