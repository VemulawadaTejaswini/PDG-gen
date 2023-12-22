import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String N;

        while((N = num.next()).charAt(0) != '0'){
            int sum = 0;
            for(int i = 0; i < N.length(); i++) {
                sum += (int)N.charAt(i) - 48;
            }
            System.out.println(sum);
        }
    }
}
