import java.util.Scanner;
 
class Main{
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   
   double d,f,g;
   
   Powmod all = new Powmod(10,n);
   Powmod b = new Powmod(9,n);
   Powmod c = new Powmod(8,n);
   
   d=all.powmod();
   f=b.powmod();
   g=c.powmod();
   
   d = d - ((2*f)-g);
   d = d % 1000000007;

   System.out.println((int)d);
 }
   
}

class Powmod{
  
  int x;
  int y;
  
  double powmod(){
    double res=1.0;
    double mod=1000000007;
    for(int i=0;i<y;i++) res = (res * x)%mod;
    return res;
  }
  
  Powmod(int x,int y){
   this.x = x;
   this.y = y;
  }
  
}