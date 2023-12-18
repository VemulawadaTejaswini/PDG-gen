import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = new StringBuilder(s).reverse().toString();

        int res = 0;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) == r.charAt(i)) {
                continue;
            }
            res++;
        }
        System.out.println(res);
    }
}
