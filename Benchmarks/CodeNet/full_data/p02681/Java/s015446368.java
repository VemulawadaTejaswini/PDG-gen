import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
public class Main {
public static void main (String[]args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
 String s = br.readLine();
 String t = br.readLine();
 if(t.contains(s) && s.length()+1 == t.length()) {
     System.out.println("Yes");
 }
 else{
     System.out.println("No");
 }

    }catch (Exception e) {
       }
       }
   }