import java.util.*;
import java.io.*;

public class Main {
    public static String rotate(String s, int r){
        return (s.substring(r,s.length()) + s.substring(0,r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean ans = false;
        
        for(int i=0;i<s.length();i++){
        	if(rotate(s,i).equals(t)) ans=true;
        }
        System.out.println(ans ? "Yes" : "No");
    }
}