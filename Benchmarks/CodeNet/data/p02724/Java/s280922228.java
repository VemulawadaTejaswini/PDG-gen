import java.util.Scanner;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.print(Logic.run(x));
  }
}
class Logic{
  static int run(int x){
    int joy = 0;
    while ( x > 0 ){
      if ( x/500 >= 0 ) {
        x/=500;
        joy+=1000;
      }else if(x/500<0 && x/5<=0 ){
        x/=5;
        joy+=5;
      }
    }
  }
}