import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += Integer.parseInt(Character.toString(n[i]));
        }
        System.out.println(sum % 9 == 0 ? "Yes" : "No");
        sc.close();

    }

}
