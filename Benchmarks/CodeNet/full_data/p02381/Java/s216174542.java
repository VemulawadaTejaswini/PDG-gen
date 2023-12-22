import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    while(true){
      int n=Integer.parseInt(scan.next());
      if(n==0)break;
      int[] s=new int[n];
      for(int i=0;i<n;i++){
        s[i]=Integer.parseInt(scan.next());
      }
      double sum=0;
      double sum2=0;
      for(int i=0;i<n;i++){
        sum+=s[i];
        sum2+=Math.pow(s[i],2);
      }
      double avg=sum/n;
      double dev=Math.sqrt(sum2/n-Math.pow(avg,2));
      System.out.println(dev);
    }
  }
}

