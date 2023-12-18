import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int min = 0;
        int prev = 0;
        int ans = 0;
        for(int i = 1; i < c.length(); i++){
            if(c[i] == '<'){
                prev += 1;
                ans += prev;
            }else{
                prev -= 1;
                ans += prev;
                min = Math.min(min,prev);
            }
        }
        System.out.println(ans-(min*c.length))
    }
}
