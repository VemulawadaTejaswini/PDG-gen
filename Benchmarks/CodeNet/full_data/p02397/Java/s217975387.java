import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int[] x=new int[3000];
    int[] y=new int[3000];
    int count=0;

    for(int i=0;i<x.length;i++){
      x[i]=Integer.parseInt(scan.next());
      y[i]=Integer.parseInt(scan.next());
      if(x[i]==0 && y[i]==0){
        break;
      }
      count++;
    }

    for(int i=0;i<count;i++){
      System.out.println(x[i]+" "+y[i]);
    }
  }
}
