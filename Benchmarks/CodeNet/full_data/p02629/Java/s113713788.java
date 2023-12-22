
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String[] list = new String[26];
        char temp = 'a';
        for(int i=0;i<26;i++){
            list[i] = String.valueOf(temp++);
        }

        String ans = "";
        while(0<n){
            n--;
            int mod = (int)( n % 26 );
            ans =ans +  list[mod];
            n = n /26;
        }
        StringBuilder sb = new StringBuilder(ans);
        String s = sb.reverse().toString();
        System.out.println(s);
    }
}