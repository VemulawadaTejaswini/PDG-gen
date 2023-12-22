import java.io.*;
import java.lang.Math;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());

    Scanner scan=new Scanner(System.in);
    int[] a=new int[n];
    for(int i=0;i<a.length;i++){
      a[i]=Integer.parseInt(scan.next());
    }

    int min=a[0];
    int max=a[0];
    for(int i=1;i<a.length;i++){
      min=Math.min(min,a[i]);
    }
    for(int i=1;i<a.length;i++){
      max=Math.max(max,a[i]);
    }

    System.out.print(min+" ");
    System.out.print(max+" ");
    int sum=0;
    for(int i=0;i<a.length;i++){
      sum+=a[i];
      if(i==a.length-1){
        System.out.println(sum);
      }
    }
  }
}
