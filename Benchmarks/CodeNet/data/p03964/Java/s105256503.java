import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int xRatio[]=new int[n];
    int yRatio[]=new int[n];
    long x[]=new long[n];
    long y[]=new long[n];
    for(int i=0;i<n;i++){
      xRatio[i]=sc.nextInt();
      yRatio[i]=sc.nextInt();
    }
    sc.close();
    x[0]=xRatio[0];
    y[0]=yRatio[0];
    for(int i=1;i<n;i++){
      double ratio1=Math.ceil((double)x[i-1]/xRatio[i]);
      double ratio2=Math.ceil((double)y[i-1]/yRatio[i]);
      double ratio=Math.max(ratio1,ratio2);
      x[i]=(long)xRatio[i]*(long)ratio;
      y[i]=(long)yRatio[i]*(long)ratio;
    }
    System.out.println(x[n-1]+y[n-1]);
  }
}