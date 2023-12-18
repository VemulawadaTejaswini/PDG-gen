import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception
    {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        
        int k = scan.nextInt();
        char[] charry = s.toCharArray();
        
        for (int i = 0; i < s.length() ; i++) {
            char ch = charry[i];
            char _ch = ch;
            int _k = k;
            if (ch=='a')continue;
            while(ch != 'a' || k !=0){
                if (ch == 'z'){
                    ch = 'a';
                }else{
                    ch++;
                }
                k--;
            }
            if (ch != 'a'){
                charry[i] = _ch;
                k = _k;
            }
            if(k==0) break;
        }
        k = k%26;
        while(k!=0){
          char ch = charry[s.length()-1];
          ch = (ch == 'z')? 'a' : ch++;
          k--;
        }
        String ans = String.valueOf(charry);
        System.out.println(ans);
    }
}
