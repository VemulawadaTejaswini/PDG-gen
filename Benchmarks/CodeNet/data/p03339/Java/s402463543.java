import java.util.*;
public class Ma{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String str=sc.next();
    char[] c=str.toCharArray();
    int W[]=new int[n+1];
    int E[]=new int[n+1];
    int min=99;

    for(int i=0;i<=n;i++){
      W[i]=0;
      E[i]=0;
    }


    for(int i=0;i<n;i++){
      W[i+1]=W[i];
      if(c[i]=='W') W[i+1]++;
      E[i+1]=E[i];
      if(c[i]=='E') E[i+1]++;
    }

    for(int i=0;i<n;i++){
      int count=W[i]+E[n]-E[i+1];
      min=Math.min(min,count);
    }


    System.out.println(min);
  }
}
