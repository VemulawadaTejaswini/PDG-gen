import  java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] H = new int[N];
    for(int i =0;i<N;i++){
      H[i] = scan.nextInt();
    }
    int max = 0;
    int i,n;
    for(int s =0;s<N;s++){
       n = 0;
       i=s;
      while(H[i]>=H[i+1]){
        i=i+1;
        n++;}
      if(n>max){
        max=n;}
    }
    System.out.println(max);
  }
}