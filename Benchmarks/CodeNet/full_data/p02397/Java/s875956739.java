import java.io.*;
import java.util.*;

class Main{

  final static int MAX_DATA=3000;

  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int[] x=new int[MAX_DATA];
    int[] y=new int[MAX_DATA];
    int count=0;
    for(int i=0;i<x.length;i++){
      x[i]=Integer.parseInt(scan.next());
      y[i]=Integer.parseInt(scan.next());
      if(x[i]==0 && y[i]==0){
        break;
      }
      count++;
    }

    Arrays.sort(x);
    Arrays.sort(y);

    System.out.println("");
    for(int j=x.length-count+1;j<x.length;j++){
      System.out.print(x[j]+" "+y[j]);
      System.out.println();
    }
  }
}
