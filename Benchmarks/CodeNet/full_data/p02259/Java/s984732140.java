import java.io.*;
import java.lang.Math;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    int[] array=new int[n];
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<array.length;i++){
      array[i]=Integer.parseInt(scan.next());
    }

    //バブルソーと
    int count=0;
    for(int i=0;i<array.length-1;i++){
      for (int j=array.length-1;j>i;j-- ) {
        if(array[j-1]>array[j]){
          int tmp=array[j-1];
          array[j-1]=array[j];
          array[j]=tmp;
          count++;
        }
      }
    }
    for(int i=0;i<array.length;i++){
      System.out.println(array[i]);
    }
    System.out.println(count);
  }
}
