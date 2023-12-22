import java.util.Scanner;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print(Logic.run(x,a,b));
  }
}
class Logic{
  public static String run(int x,int a,int b){
    String resMes="";
    for ( int i = a; i<=b;i++){
      if ( i%x == 0 ){
        resMes="OK";
        break;
      }
    }
    if (resMes.equals("")){
      resMes = "NG";
    }
    return resMes;
  }
}