import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a,b,c;
    double sa,sb,sc;
    a=sc.nextLong();
    b=sc.nextLong();
    c=sc.nextLong();
    sa=Math.sqrt((double)a);
    sb=Math.sqrt((double)b);
    sc=Math.sqrt((double)c);
    if(sa+sb<sc){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}