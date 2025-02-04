import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n < 27) {
            System.out.println((char)('a' + n -1));
            return;
        }
        long b = 0;
        List<Character> list = new ArrayList<>();
        do {
            b = n % 26;
            list.add((char)('a' + b -1));
            n /= 26;
        } while (n >= 26);
        list.add((char)('a' + n -1));
        Collections.reverse(list);
        for(char c : list) {
            System.out.print(c);
        }
    }
}