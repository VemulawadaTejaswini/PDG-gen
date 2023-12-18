import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long x = 0;
    long y = 0;
    for(long i = 1;i <= 1000000000;i++){
      if(s%i==0&&s/i<=1000000000){
        x=i;
        y=s/i;
        break;
      }
    }
    System.out.println(0+" "+0+" "+x+" "+0+" "+0+" "+y);
  }
}