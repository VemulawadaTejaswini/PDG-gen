import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    long i = 1l;
    while(x*i<=1000000000000000000l&&i<=y){
      if(x*i%y!=0){
        System.out.println(x*i);
        return;
      }
      i++;
    }
    System.out.println(-1);
  }
}
