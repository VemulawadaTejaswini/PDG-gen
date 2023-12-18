import java.util.*;
import java.lang.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    double e = 0;
    double max = e;
    for(int i = 2;i <= 10;i++){
      for(int j = 1;i <= 10;j++){
        e = Math.pow(j,i);
        if(e <= x && max < e){
          max = e;
        }
        if(e > x) break;
      }
      if(e > x) break;
    }
    int emax = (int)max;
    System.out.println(emax);
  }
}