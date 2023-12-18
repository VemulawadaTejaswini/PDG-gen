import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long k = sc.nextLong();
    for(int i=0;i<k;i++){
      long total=a+b+c;

      a=total-a;
      b=total-b;
      c=total-c;
    }
    if(a-b<=(long)Math.pow(10,18)||b-a<=(long)Math.pow(10,18)){
      System.out.print(a-b);
    }else{
      System.out.print("Unfair");
    }

  }
}
