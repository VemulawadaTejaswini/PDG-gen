import java.io.*;
public class Main {
public static void main (String[]args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
 String s = br.readLine();
 String t = br.readLine();
 if((t.substring(0,t.length()-1).equals(s))) {
    System.out.println("Yes");
 }
 else{
    System.out.println("No");
 }

    }catch (Exception e) {
       }
       }
   }