import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        long sum = 0;

        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }

        System.out.println(sum % 9 == 0 ? "Yes" : "No");

    }
}
