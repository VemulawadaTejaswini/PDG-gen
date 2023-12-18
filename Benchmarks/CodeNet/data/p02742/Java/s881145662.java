import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        if(r == 1 || c == 1) {
            System.out.println("1");
        }
        else {
           if(r % 2 == 0) {
                System.out.println((r/2)*c);
            }
            else if(r % 2 != 0) {
                int ans = 0;
                int temp = (r/2)+1;
                for(int i = 1; i <= c; i++) {
                    if(i % 2 != 0) {
                        ans += temp;    
                    }
                    else {
                        ans += temp-1;
                    }
                }
                System.out.println(ans);   
            } 
        }
    }
}
