/*
非負整数L、Rが与えられます。
２つの整数i,jをL<=i<j<=Rを満たすように選びます。
(i*J)mod2019の最小値を求めてください。
 */

import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);


      int L=sc.nextInt();
      int R=sc.nextInt();
      int i;
      int j;
      int m;
      int min=2019;

      for(int k=L;k<=R-1;k++){
        for(int s=k+1;s<=R;s++){
          i=k;
          j=s;
          m=i*j%2019;
          if(min>=m){
            min=m;
          }
        }

    }
    System.out.println(min);
  }
}