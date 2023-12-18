import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long x =sc.nextLong();
    long y=100;
    double z;
    for(long i=1;;i++){
      z=y*1.01;
      y=(long)z;
      if(y>=x){System.out.println(i);System.exit(0);}
    }
  }
}