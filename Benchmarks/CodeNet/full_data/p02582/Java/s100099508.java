import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      
      char[] ch = new char[str.length()]; 
  
      for (int i = 0; i < str.length(); i++) { 
          ch[i] = str.charAt(i); 
      } 
      int count = 0;
      
      for (int i = 0; i< str.length(); i++){
        if (ch[i] == 'R'){
          count++;
        }
      }
      
      System.out.println(count);
    }
}