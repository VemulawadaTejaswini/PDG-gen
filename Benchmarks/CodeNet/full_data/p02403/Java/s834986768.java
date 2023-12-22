import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int h=Integer.parseInt(scan.next());
    int w=Integer.parseInt(scan.next());

    int flag=1;
    for(int i=0;i<(2*h-1);i++){
      for(int j=0;j<w;j++){
        if(flag%2!=0){
          System.out.print("#");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
      flag++;
    }
  }
}

