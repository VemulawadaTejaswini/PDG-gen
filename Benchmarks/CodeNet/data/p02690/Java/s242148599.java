import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int x=scn.nextInt();
      int xr=Math.pow(x,(1/5));
      int a=0,b=0;
      boolean flg=true;
      
      while(flg){
        for(b=0;b>=xr;b--){
            if(Math.pow(a,5)-Math.pow(b,5)==x) {
                flg=false;
                break;
            }
        }
        if(flg){
            a++;
        }else break;
      }
      System.out.println(a+" "+b);
    }
}
