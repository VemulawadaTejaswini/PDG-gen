import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int[] w=new int[n+1];
    int[] e=new int[n+1];
    for(int i=0;i<n;i++){
      w[i+1]=s.charAt(i)=='W'?1:0;
      e[i+1]=s.charAt(i)=='E'?1:0;
    }
    for(int i=0;i<n;i++){
      w[i+1]+=w[i];
      e[i+1]+=e[i];
    }
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      min=Math.min(e[n]-e[i]+w[i]-w[0],min);
    }
    System.out.println(min);
  }
}