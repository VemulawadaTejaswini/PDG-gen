import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        double n1,n2;
        Scanner sc = new Scanner(System.in);
       n1=sc.nextDouble();
       n2=sc.nextDouble();
     double x,y;
      x=(double)n1/0.08;
      y=(double)n2/0.1;
      if(x==y)
        System.out.println(x);
      else
        System.out.println(-1);
        
    }
}