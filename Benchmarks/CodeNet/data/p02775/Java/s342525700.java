import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            int n = Integer.parseInt(s.substring(i,i+1));
            if (n>5) {
                sum += 10 -n ;
            } else {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}