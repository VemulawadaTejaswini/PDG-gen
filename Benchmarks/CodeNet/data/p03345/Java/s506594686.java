import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); long k=sc.nextLong();
    if(k%2==0)
      System.out.println(b-a);
    else 
      System.out.println(a-b);
  }
}