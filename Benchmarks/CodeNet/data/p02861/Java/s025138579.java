import java.util.*;
class Main{
  static int kaizyo(int n){
    int sum=1;
    for(int i=n;i>0;i--){
      sum*=i;
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    double[] x=new double[N];
    double[] y=new double[N];
    for(int i=0;i<N;i++){
      x[i]=scan.nextDouble();
      y[i]=scan.nextDouble();
    }
    int n=kaizyo(N);
    double[] trail=new double[n];
    double average=0;
    int k=0;
    double ans=0;
    for(int i=0;i<N-1;i++){
      for(int j=i+1;j<N;j++){
        trail[k++]=Math.sqrt((x[j]-x[i])*(x[j]-x[i])+(y[j]-y[i])*(y[j]-y[i]));
      }
    }
    int X=2*kaizyo(N-1);
    for(int i=0;i<k;i++){
        ans+=(trail[i]*X);
    }
    average=(double)ans/n;
    System.out.println(average);
  }
}