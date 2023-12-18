import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      double x=scn.nextDouble();
      double a=0,b=0;
      
      OUT:while(true){
        for(b=0;b>=-x;b--){
            if(Math.pow(a,5)-Math.pow(b,5)==x) {
                break OUT;
            }
        }
        a++;
      }
      OUT:
      System.out.println((int)a+" "+(int)b);
    }
}
