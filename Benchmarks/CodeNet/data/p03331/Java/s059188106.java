import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
 
 
class Main
{
    public static void main(String[] args)
    {
        int ans = 0;
        
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next(); 
        
        int a = Integer.parseInt(n);
        int b = n.length();
        if(a % 100 == 0){
            System.out.println("10");
        }else if(a > 10){
            for(int i = 0;i<b;i++){
                char ch = n.charAt(i);
                ans += Character.getNumericValue(ch);
            }
            System.out.println(ans);
        }else{
            System.out.println(n);
        }
        scanner.close();
    }
}