

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        if(isPalin(a) && isPalin(a.substring(0,(a.length()-1)/2))&& isPalin(a.substring((a.length()+3)/2,a.length()-1)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean isPalin(String a){
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i))
                return false;
        }
        return true;
    }

}