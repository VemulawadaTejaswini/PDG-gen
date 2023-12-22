import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    long k=sc.nextLong();
    int arr[]=new int[t];
    int vis[]=new int[t];
    for(int i=0;i<t;i++){
      arr[i]=sc.nextInt()-1;
      vis[i]=0;
    }
    int curr=0;
    while(k!=0)
    {
      curr=a[curr];
      k--;
  }
    System.out.println(curr);
}
}
