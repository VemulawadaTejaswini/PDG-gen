import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
       String isWin = "";
    
       int [] a = new int [4];
     
       
       String  lines = br.readLine();    
    
       String[] strs = lines.trim().split("\\s+");
      
       for (int i = 0; i < strs.length; i++) {
       a[i] = Integer.parseInt(strs[i]);
       }

       if(a[0]>a[2]){
           isWin = "Yes";
       }
       else{
           isWin = "No";
       }
       System.out.println(isWin);
    }catch (Exception e) {
    }
    
}}