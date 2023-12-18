import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        int ind = 0;
        while(true){
            int tmp = s.indexOf(s,ind);
            if(tmp == -1){
                break;
            }else{
                ans++;
                ind = tmp;
            }
        }
        System.out.println(ans);
    }
}
 