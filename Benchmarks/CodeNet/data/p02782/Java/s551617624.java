import java.util.*;

class Main{
  public static double func(int s){
    double ans=1.0;
    for(int i=1;i<=s;i++){
      ans*=i;
    }
    return ans;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    int MAX=1000000007;
    double frc=0.0;
    double ans=0.0;
    
    frc=func(r1+c1)/(func(r1)*func(c1));
    ans=frc%MAX;
    double fRC=frc;
    for(int i=0;i<=c2-c1;i++){
      for(int j=0;j<=r2-r1;j++){
        double FRC=fRC*((r1+c1+i+j+1)/(r1+j+1));
        ans+=FRC%MAX;
        ans=ans%MAX;
      }
      fRC=frc*((r1+c1+i+1)/(c1+i+1));
      frc=fRC;
    }
    System.out.print(ans+frc);
  }
}
