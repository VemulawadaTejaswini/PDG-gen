import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++) {
      a[i]=sc.nextInt();
    }
    int b[]=new int[n+1];
    for (int i=0;i<n;i++) {
      b[i+1]=a[i]+b[i];

    }

    for (int i=0;i<b.length;i++) {
      System.out.print(b[i]+" ");

    }

    System.out.println();

    int count=0;

    for (int i=0;i<b.length-1;i++) {
      for (int j=i+1;j<b.length;j++) {
        if((b[j]-b[i])==0){
          // System.out.println(b[j]);
          // System.out.println(b[i]);
           count++;
       }
      }
    }

    System.out.println(count);
  }
}
