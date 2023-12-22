import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    StringBuilder str=new StringBuilder(scan.next());
    int q=Integer.parseInt(scan.next());

    for(int i=0;i<q;i++){
      String order=scan.next();
      int a=Integer.parseInt(scan.next());
      int b=Integer.parseInt(scan.next());
      if(order.equals("print")){
        System.out.println(str.substring(a,b+1));
      }else if(order.equals("reverse")){
        StringBuilder buf=new StringBuilder(str.substring(a,b-a+1));
        buf.reverse();
        str.replace(a,b+1,buf.toString());
      }else if(order.equals("replace")){
        String addStr=scan.next();
        str.replace(a,b+1,addStr);
      }
    }
  }
}

