import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int q=scan.nextInt();
    long s[]=new long[a];
    long t[]=new long[b];
    long x[]=new long[q];
    
    long min;
    long u,v;
    
    for(int i=0;i<a;i++){
      s[i]=scan.nextLong();
    }
    for(int i=0;i<b;i++){
      t[i]=scan.nextLong();
    }
    for(int i=0;i<q;i++){
      x[i]=scan.nextLong();
    }
    long c;
    long d;
    long e;
    long f;
    int ii,jj;
    for(int i=0;i<q;i++){
      c=1145148101919L;
      d=1145148101919L;
      e=1145148101919L;
      f=1145148101919L;
      for(int j=0;j<=a/100;j++){
        if(x[i]<=s[j*100]){
          jj=j*100;
          j=a+1;
        }
      }
      for(int j=0;j<101;j++){
        if((x[i]>s[jj-j])&&(x[i]<s[jj-j+1])){
          ii=jj-j;
        }
      }
      c=x[i]-s[ii];
      d=s[ii+1]-x[i];
      for(int j=0;j<=b/100;j++){
        if(x[i]<=t[j*100]){
          jj=j*100;
          j=a+1;
        }
      }
      for(int j=0;j<101;j++){
        if((x[i]>t[jj-j])&&(x[i]<t[jj-j+1])){
          ii=jj-j;
        }
      }
      e=x[i]-t[ii];
      f=t[ii+1]-x[i];
      min=Math.min(Math.max(c,e),Math.max(d,f));
      u=Math.min(c+c+f,c+f+f);
      v=Math.min(d+d+e,d+e+e);
      u=Math.min(u,v);
      min=Math.min(min,u);
      System.out.println(min);
    }
  }
}
