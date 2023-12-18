import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextDouble();
      double b = sc.nextDouble();
      double x = sc.nextDouble();

     double menseki = x/a;
      if(menseki>a*b/2){
        menseki=a*b-menseki;
        System.out.println(Math.toDegrees(Math.atan((menseki*2/a)/a)));
      }else{
        System.out.println(Math.toDegrees(Math.atan(b/(menseki*2/b))));
      }
    }

}
