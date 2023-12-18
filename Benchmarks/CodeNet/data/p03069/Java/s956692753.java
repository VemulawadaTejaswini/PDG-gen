import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        char[] a = new char[n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            a[i] = s.charAt(i);
        }
        String str = "";
        
        
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                if (a[i] == '#' && a[i + 1] == '.') {
                    if (i < n - 2) {
                        if (a[i + 2] == '#') {
                            a[i + 1] = '#';
                        } else {
                            a[i] = '.';
                        }
                    } else {
                        a[i + 1] = '#';
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (a[i] != s.charAt(i)) {
                cnt++;
            }
            //System.out.println(a[i]);
        }
        System.out.println(cnt);
    }
}
