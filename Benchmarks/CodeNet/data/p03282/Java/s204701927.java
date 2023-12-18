import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        long k = in.nextLong();
        int one = 0;
        while(one < s.length() && s.charAt(one) == '1') one++;
        if(k < one) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(one));
        }
    }
}
