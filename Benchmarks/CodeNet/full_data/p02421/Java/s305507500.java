import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String card1, card2;
        int taro = 0, hanako = 0;
        
        for (int i = 0; i < n; i++) {
            card1 = sc.next();
            card2 = sc.next();
            int result = card1.compareTo(card2);
            if (result > 0) taro += 3;
            else if (result < 0) hanako += 3;
            else {
                taro++;
                hanako++;
            }
        }
        System.out.println(taro + " " + hanako);
    }
}
