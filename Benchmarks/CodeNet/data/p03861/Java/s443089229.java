import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();
            int count = 0;
            for (int i = a; i <= b; i++) {
                if (i % x == 0) {
                    count++;
                }  
            }
            System.out.println(count);       
    }
}
