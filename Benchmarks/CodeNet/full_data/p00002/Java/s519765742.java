 	

import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt(), b = sc.nextInt();
            int c = a+b;
            int x = 1;
            while (c >= 10) {
                c /= 10;
                cnt++;
           }
            System.out.println(x);
        }
    }
}