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
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        
        if(d == 0){
            System.out.println(n);
        }else{
            ans += n;
            for(int i = 0;i < d;i++){
                ans *= 100;
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}