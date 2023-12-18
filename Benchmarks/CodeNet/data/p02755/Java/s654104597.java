import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    for(double i=1; i>10000;i++){
      if(Math.floor(i*0.08)==A&&Math.floor(i*0.1)==B){
        System.out.println((int)i);
        return;
      }
    }
    System.out.println(-1);

  }
}


