import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      double x=scn.nextDouble();
      double a=0,b=0;
      boolean flg=true;
      
      while(flg){
        for(b=0;b>=-x;b--){
            if(Math.pow(a,5)-Math.pow(b,5)==x) {
                flg=false;
                break;
            }
        }
        if(!flg) break;
        a++;
      }
      System.out.println((int)a+" "+(int)b);
    }
}
