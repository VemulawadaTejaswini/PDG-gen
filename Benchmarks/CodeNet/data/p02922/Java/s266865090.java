import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 0;
        int cnt = 0;
        while (true) {
            cnt++;
            num += n;
            if (num >= m) {
                break;
            }
            num--;
        }
        System.out.println(cnt);
    }    
}
