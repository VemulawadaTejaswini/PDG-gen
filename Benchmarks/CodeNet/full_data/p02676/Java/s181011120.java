import java.util.*;

public class Test{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String str =sc.next();
        int len = str.length();
        if(len > n){
            String s = str.substring(0,n);
            System.out.println(s+"...");
        }else{
            System.out.println(str);
        }
    }
}