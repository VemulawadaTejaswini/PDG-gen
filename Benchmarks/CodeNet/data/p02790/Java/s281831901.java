import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
    static String rep(String s, int n){
        String ans = "";
        for(int i=0; i<n; i++) ans = ans + s;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String x = rep(Integer.toString(a), b);
        String y = rep(Integer.toString(b), a);
        System.out.println(x.compareTo(y)>0 ? y : x);

    }


}
