import java.util.*;
  public class Main{
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] counter  =new int[30];
        
        int i;
        while(sc.hasNext()){
        String str = sc.next();
        String str_low  =str.toLowerCase();
        for(i=0;i<str.length();i++){
          
          
          char value = str_low.charAt(i);
          if(value<123 && value>=97){
          counter[value-97]++;
        }
      }
      }
        for(i=97;i<123;i++){
          System.out.printf("%c : %d\n",i,counter[i-97]);
        }
      }
    }
