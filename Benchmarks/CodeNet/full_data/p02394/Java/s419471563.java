import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int W=Integer.parseInt(scan.next());
    int H=Integer.parseInt(scan.next());
    int x=Integer.parseInt(scan.next());
    int y=Integer.parseInt(scan.next());
    int r=Integer.parseInt(scan.next());

    
    if((x-r>=0) && (x+r<=W) && (y-r>=0) && (y+r<=H) ){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
