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
    int ia=0;
    int ja=0;
    for(int i=0;i<q;i++){
      c=1145148101919L;
      d=1145148101919L;
      e=1145148101919L;
      f=1145148101919L;
      ja=a;
      for(int j=0;j<a/100;j++){
        if(x[i]<=s[j*100]){
          ja=j*100;
          j=a+1;
        }
      }
      for(int j=1;j<101;j++){
        if((x[i]>s[ja-j])&&(x[i]<s[ja-j+1])){
          ia=ja-j;
        }
      }
      c=x[i]-s[ia];
      d=s[ia+1]-x[i];
      
      ja=b;
      for(int j=0;j<b/100;j++){
        if(x[i]<=t[j*100]){
          ja=j*100;
          j=b+1;
        }
      }
      for(int j=1;j<101;j++){
        if((x[i]>t[ja-j])&&(x[i]<t[ja-j+1])){
          ia=ja-j;
        }
      }
      e=x[i]-t[ia];
      f=t[ia+1]-x[i];
      min=Math.min(Math.max(c,e),Math.max(d,f));
      u=Math.min(c+c+f,c+f+f);
      v=Math.min(d+d+e,d+e+e);
      u=Math.min(u,v);
      min=Math.min(min,u);
      System.out.println(min);
    }
  }
}
