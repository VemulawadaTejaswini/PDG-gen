import java.util.*;

public class Main {
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        String x;
        a = sc.nextInt();
        b = sc.nextInt();
        x = sc.next();
        char[] c = x.toCharArray();
        boolean d = true;
        
        for(int i=0 ; i<a ; i++) {
            if(c[i] == '-') {
                System.out.println("No");
                d = false;
                if(d == false) break;
            }
        }
        if(d == true) {
            if(c[a] != '-') {
                System.out.println("No");
            }
        }
        if(d == true) {
            for(int i=a+1 ; i<a+b+1 ; i++) {
                if(c[i] == '-') {
                    System.out.println("No");
                    d = false;
                    if(d == false) break;
                }
            }
        }
        if(d == true) {
            System.out.println("Yes");
        }
     }
}