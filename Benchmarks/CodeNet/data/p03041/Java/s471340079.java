import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static long n,a,b,k;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextInt();
        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();
        s[k-1] =(char)( s[k-1]-('A'-'a'));
        System.out.println(new String(s));
    }
}

