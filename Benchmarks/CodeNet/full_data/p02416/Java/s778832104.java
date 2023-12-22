import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws java.lang.NumberFormatException{
    Scanner scan=new Scanner(System.in);

    while(true){
      int num=Integer.parseInt(scan.next());
      if(num==0)break;

      String buf=String.valueOf(num);
      int sum=0;

      for(int i=0;i<buf.length();i++){
        sum+=Character.getNumericValue(buf.charAt(i));
      }
      System.out.println(sum);
    }
  }
}
