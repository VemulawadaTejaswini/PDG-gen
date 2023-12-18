import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int price = sn.nextInt();
        int cnt = 0;
        
        if((price / 500) != 0) {
            cnt += 1000 * (price / 500);
            price %= 500;
        } 
        
        if((price / 5) != 0) {
            cnt += 5 * (price / 5);
        }
        
        System.out.print(cnt);
        
    }
}