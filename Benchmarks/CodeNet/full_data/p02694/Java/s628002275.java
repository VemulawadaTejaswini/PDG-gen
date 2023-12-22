import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long x =sc.nextLong();
    double y=(Math.log10(x)-2)/Math.log10(1.01);
    for(int i=0;;i++){
      if(i>=y-1){System.out.println(i+1);System.exit(0);}
    }
  }
}
