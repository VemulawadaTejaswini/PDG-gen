import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // 電車1人A
        // タクシーN人B
        System.out.println("XXXXXXXX");
        // Scanner scan = new Scanner(System.in);
 
        // String str = scan.next();
        
        Scanner in = new Scanner(System.in);
        String str= in.next();
        
        String[] strs = str.split(" ", 0);
        
        //train
        int train = Integer.parseInt(strs[0]) * Integer.parseInt(strs[1]);
        int taxi = Integer.parseInt(strs[0]) / Integer.parseInt(strs[2]);
        
        if (train < taxi) { 
            System.out.println(train);
        } else if (train > taxi) {
            System.out.println(taxi);
        }
        
    }
}
