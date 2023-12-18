import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
  	for(int i=0;i<n;i++)a[i]=sc.nextInt();
    Arrays.sort(a);
    double value=a[n-1];
    for(int i=n-1;i>=0;i--){
   	value=(value+a[i])/2;
    }
    System.out.println(value);
  }
}