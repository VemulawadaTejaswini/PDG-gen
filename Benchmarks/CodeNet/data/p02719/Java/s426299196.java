import java.util.*;
import java.io.*;
public class Main{

    public static void main(String []args) throws Exception {
        //BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(" ");
        long n = Long.parseLong(str[0]);
        long k = Long.parseLong(str[1]);
        
        long diff  = Math.abs(n-k);
        long ref = n/diff;
        long b = 0;
        if(n > k){
            b = n;
        }else{
            b =k;
        }
        long ans = Math.abs((ref*diff) - b);
        System.out.println(Math.min((int)diff , (int)ans));
        
    }
}