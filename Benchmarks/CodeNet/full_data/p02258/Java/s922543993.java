import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int max = 20000;
     int[] R = new int[n];
     for(int i=0;i<n;i++){
       R[i] = scanner.nextInt();
     }

     for(int i=0;i<n-1;i++){
       for(int j=i+1;j<n;j++){
         if(i==0&&j==1){
           max = R[j] - R[i];
         }else{
           int p = R[j] - R[i];
           if(max < p)max = p;
         }
       }

     }
     System.out.println(max);

  }



}
