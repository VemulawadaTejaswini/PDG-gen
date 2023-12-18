import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();

        s = s.substring(a, Math.max(c,d));

        if (s.contains("##")) {
            System.out.print("No");
        } else {
            if (c < d) {
                System.out.print("Yes");
            } else if(d < c){
                if (s.contains("...")) {
                    System.out.print("Yes");
                } else {
                    System.out.print("No");
                }
            }
        }
    }
}