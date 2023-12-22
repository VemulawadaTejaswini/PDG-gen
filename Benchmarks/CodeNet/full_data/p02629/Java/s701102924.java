import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextLong();
        String res = "";
        while(n > 0){
            char c = (char)((n % 26 == 0 ? 1 : n % 26) - 1 + 'a');
            res = c + res;
            n /= 26;
        }
        System.out.println(res);
    }
}