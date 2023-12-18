import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    int y=s.nextInt();
    int a[]={300000,200000,100000};
    int sum=0;
    if(x<=3)
      sum+=a[x-1];
    if(y<=3)
      sum+=a[y-1];
    if(x==1&&y==1)
      sum+=400000;
    System.out.println(sum);
  }
}