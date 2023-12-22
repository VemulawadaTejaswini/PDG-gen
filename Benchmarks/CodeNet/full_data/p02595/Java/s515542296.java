import java.util.Scanner;


public class Main{
  public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   double d = scanner.nextInt();
   //System.out.println(d);
   int x[];
   int y[];
   int cnt = 0;
   x = new int[n];
   y = new int[n];
   double z = 0;
    for(int i=0;i<n;i++){
     x[i] = scanner.nextInt();
     y[i] = scanner.nextInt();
     z = (double)Math.sqrt(x[i]*x[i]+y[i]*y[i]);
  //System.out.println(z);
     //if(Math.sqrt(x[i]*x[i]+y[i]*y[i])<=d){
     if(z<=d){
          cnt++;
          //System.out.println(d + " " + z);
     }else{
     }
   }
  System.out.println(cnt);
  }
}