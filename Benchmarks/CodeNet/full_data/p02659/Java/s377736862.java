import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String[] s = sc.next().split("[.]");

        long b = Integer.valueOf(s[0]) * 100 + Integer.valueOf(s[1]);

        long result = (a * b) / 100;

        System.out.println(result);
    }
}
