import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);

    while(true){
      StringBuilder sb=new StringBuilder(scan.next());
      if(sb.toString().equals("-"))break;
      int m=Integer.parseInt(scan.next());
      for(int i=0;i<m;i++){
        int h=Integer.parseInt(scan.next());
        String buf=sb.substring(0,h);
        sb.delete(0,h);
        sb.append(buf);
      }
      System.out.println(sb);
    }
  }
}
