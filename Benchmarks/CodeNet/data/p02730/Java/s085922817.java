import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        boolean pld=true;
        int l=s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-1-i))pld=false;
        }
        for(int i=0;i<(l-1)/4;i++){
            if(s.charAt(i)!=s.charAt((l-1)/2-1-i))pld=false;
        }
        for(int i=(l+3)/2;i<(l-(l+3)/2)/2;i++){
            if(s.charAt(i)!=s.charAt(l-1-i))pld=false;
        }
        if(pld){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}