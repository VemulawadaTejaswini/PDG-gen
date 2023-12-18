import java.util.*;
import java.lang.Math;
class Main{
  public static void main(String args[])throws Exception{
    Scanner sc = new Scanner(System.in);
    double H = sc.nextDouble();
    double W = sc.nextDouble();
    if(W%2 == 0){
        System.out.print((long)((W/2)*H));
    }else{
    System.out.print((long)(((W+1)/2)*Math.ceil(H/2)+((W-1)/2)*Math.floor(H/2)));
    }
  }
}