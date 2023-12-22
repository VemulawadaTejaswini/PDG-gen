import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
  
 public static void main(String args[]){
   
  Scanner s = new Scanner(System.in);
   
  int n=s.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
         a[i]=s.nextInt();
     
     Arrays.sort(a);
     
     Queue<Integer> qq = new LinkedList<Integer>();
     if(n==1){
      System.out.println("0");   
     }else if(n==2){
      System.out.println(a[1]);   
     }else{
         qq.add(a[n-2]);
         qq.add(a[n-2]);
         int sum=0;
         sum+=a[n-1];
         for(int i=n-3;i>=0;i--){
             
             sum+=qq.remove();
             qq.add(a[i]);
             qq.add(a[i]);
             
         }
         System.out.println(sum);
     }
 }
  
}