import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(base26(n));

    }

    static String base26(long n) {
        StringBuilder buf = new StringBuilder();
        while (n != 0) {
            buf.append((char) ((n - 1) % 26 + 'a'));
            n = (n - 1) / 26;
        }
        return buf.reverse().toString();
    }

}
