import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int k=sc.nextInt();
    int sum=0;
    if(k<=a)
      sum=sum+k;
    else if(k<=(a+b))
      sum=sum+a;
    else
      sum=sum+a-(k-a-b);
    System.out.println(sum);
  }
}
