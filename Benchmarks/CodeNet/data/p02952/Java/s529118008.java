import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        
        for (int i = 1; i <= a; i++) {
            if (Integer.toString(i).length() % 2 == 1) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
