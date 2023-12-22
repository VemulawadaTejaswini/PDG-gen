import java.util.*;
public class Main{   
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  String  a = scanner.next();
        char[] chars = a.toCharArray();
        int sum =0;
        for (char aChar : chars) {
            sum+= aChar-'0';
        }

        if(sum%9==0)
        {
            System.out.println("Yes");
        }else
        {
            System.out.println("No");
        }
    
    }
}