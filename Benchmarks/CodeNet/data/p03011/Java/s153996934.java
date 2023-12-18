import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int ca = sc.nextInt();

        int result = ab + bc;
        if (ab + ca <= result) {
            result = ab + ca;
        } else if (bc + ca <= result) {
            result = bc + ca;
        } 
        
        System.out.println(result);
    }
}
