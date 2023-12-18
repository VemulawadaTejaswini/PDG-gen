import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String result = "AGC";
        if (n < 1200) {
            result = "ABC";
        } else if (n < 2800) {
            result = "ARC";
        }

        System.out.println(result);
    }
}
