import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt(), D=sc.nextInt(), t=0, a,b,d;
    D*=D;
    for(int i=0; i<N; i++){
      a=sc.nextInt();
      b=sc.nextInt();
      d = a*a +b*b;
      if(d<=D) t++;
    }
    System.out.println(t);
  }
}