import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();

        char[] c = new char[a.length + b.length];

        StringBuilder sb = new StringBuilder(a.length + b.length);
        sb.append(a);
        sb.append(b);

        int num = Integer.parseInt(sb.toString());

        String ans;

        ans = (Math.sqrt(num) % 1 == 0) ? "Yes" : "No";

        System.out.println(ans);

    }

}
