import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    long k = sc.nextInt();
    for(int i=0;i<k;i++){
      long an=b+c;
      long bn=a+c;
      long cn=a+b;
      a=an;
      b=bn;
      c=cn;
    }
    if(a-b<=(long)Math.pow(10,18)||b-a<=(long)Math.pow(10,18)){
      System.out.print(a-b);
    }else{
      System.out.print("Unfair");
    }

  }
}
