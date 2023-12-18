import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0,i;
        for(i = 1; i <= c; i = i+2) {
            if(i <= r && i <= c) {
                ans += i;
            }
            else if(i > r && i <= c && r != 1) {
                ans += r;
            }
        }
        int temp = 2;
        if(i - 1 == c) {
            temp = 1;
        }
        for(int j = r-temp; j > 0 ; j = j - 2){
            if(j <= c) {
                ans += j;
            }
            else {
                ans += c;
            }
        }
        System.out.println(ans);
    }
}
