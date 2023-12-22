import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextLong();
        String res = "";
        while(n > 0){
            char c = (char)((n % 26 == 0 ? 26 : n % 26) - 1 + 'a');
            res = c + res;
            if(n % 26 == 0)
                n = n / 26 - 1;
            else
                n/= 26;
        }
        System.out.println(res);
    }
}