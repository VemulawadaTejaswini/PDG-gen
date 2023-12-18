//package tear;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long k = s.nextLong();
        for (int i = 0; i < k; ) {
            if(i!=k){
                a =a-1;
                i++;
            }
            if(i!=k){
                b=b-1;
                i++;
            }
            
        }
        System.out.println(a+"  "+ b);
    }
}
