import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int l = sn.nextInt();
        int r = sn.nextInt();
        int d = sn.nextInt();
        int cnt = 0;
        
        for(int i = l; i <= r; i++) {
            if(i % d == 0) {
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}
