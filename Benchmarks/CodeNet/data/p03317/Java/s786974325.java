import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] t=br.readLine().split(" ");
      int n=Integer.parseInt(t[0]);
      int k=Integer.parseInt(t[1]);
      t=br.readLine().split(" ");
      int[] arr=new int[n];
      int minIndex=0;
      int minValue=Integer.MAX_VALUE;
      for(int i=0;i<t.length;i++){
        arr[i]=Integer.parseInt(t[i]);
        if(arr[i]<minValue){
          minIndex=i;
          minValue=arr[i];
        }
      }
      int operations=0;
      int i=minIndex;
      while(i>0){
        operations++;
        i=i-k+1;
      }
      i=minIndex;
      while(i<arr.length-1){
        operations++;
        i=i+k-1;
      }
      System.out.println(operations);
    }
  }
