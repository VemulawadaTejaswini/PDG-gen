import java.util.*;
import java.io.*;

public class Main{

     public static void main(String []args){
       Scanner scanner = new Scanner(System.in);
       int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        boolean b = false;
        
        for(int i=0;i<n2;i++){
       
        list.add( scanner.nextInt());
        }
       
      while(!b)
      {
          String s = String.valueOf(n1);
       
          int counter=0;
          char [] c1 = s.toCharArray();
          for(int i=0;i<s.length();i++)
          {
             int a = (int) s.charAt(i)-'0';
              if(list.contains(a))
              {
               
                  n1++;
                  break;
              }
              else
              {
                counter++;  
              }
          }
          
          if(counter==s.length())
          {
              b=true;
              break;
              
          }
          
          
      }
      
      System.out.println(n1);
       
     }
}