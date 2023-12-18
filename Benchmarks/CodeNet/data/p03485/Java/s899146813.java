import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int n = sc.nextInt();
                int k = sc.nextInt();
                sc.close();
                System.out.println((n + k + 1) / 2);
        }
}