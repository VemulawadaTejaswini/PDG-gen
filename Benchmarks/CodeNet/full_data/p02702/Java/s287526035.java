import java.util.Scanner;
import java.util.Set;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        int size = n.length();

        int count = 0;


        String sub;
        long subNum;

        for (int i = 1; i <= size; i++) {
            for (int j = i+1; j <= size; j++) {
                sub = n.substring(i-1,j);
                //int sSize = sub.length();
                while(true) {
                    if (sub.charAt(0) != '0') {
                        break;
                    } 
                    sub = sub.substring(1);
                }
                
                subNum = Long.parseLong(sub);
                if (subNum%2019 == 0) {
                    count++;
                }
            }
            
        }

        System.out.println(count);
 
        scan.close();
    }
}
