
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();

        int count1 = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '1') {
                break;
            }
            count1++;
        }
        if(k > count1) {
            System.out.println(s.charAt(count1));
        } else {
            System.out.println("1");
        }
    }
}
