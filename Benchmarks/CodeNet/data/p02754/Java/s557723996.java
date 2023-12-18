import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        int acount = 0;
        for (int i = 0; count < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a && count != n; j++) {
                    count++;
                    acount++;
                }
            } else {
                count += b;
            }
        }
        System.out.println(acount);
    }
}