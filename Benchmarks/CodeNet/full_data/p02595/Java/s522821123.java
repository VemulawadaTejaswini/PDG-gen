import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
 
    int n = sc.nextInt();
    double d = sc.nextDouble();
    int c = 0;
    for(int i = 0;i < n;i++){
      double x = sc.nextDouble();
      double y = sc.nextDouble();
      
      double x1 = Math.pow(x,2);
      double y1 = Math.pow(y,2);
      
      double ans = Math.sqrt(x1 + y1);
      if(ans <= d){
        c++;
      }
    }
      System.out.println(c);
  }
}