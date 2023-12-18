import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long x1 =0;
    long y1=0;
    long x2=1000000000;
    long y2 =1;
    long start = s/x2;
    for(long i=start;i<=x2;i++){
      long x3 = i*x2-s;
      if(x3>=0 && x3<=x2){
        System.out.print(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+i);
        break;
      }
    }
  }
}