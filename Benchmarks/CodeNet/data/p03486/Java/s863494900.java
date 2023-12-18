import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        Arrays.sort(s);
        String sAsc = new String(s);

        StringBuilder tDesc = new StringBuilder(new String(t));
        tDesc = tDesc.reverse();

        if (sAsc.compareTo(tDesc.toString()) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
