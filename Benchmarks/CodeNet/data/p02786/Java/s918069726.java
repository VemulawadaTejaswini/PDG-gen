import java.util.*;
public class Main {
  
  public static double cal(double h){
    if(h == 1.0){
      return 1.0;
    }
    else
    {
      return cal(Math.floor(h/2))*2 + 1.0;
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	double h = sc.nextDouble();
    System.out.println(String.format("%.0f", cal(h)));
  }
}