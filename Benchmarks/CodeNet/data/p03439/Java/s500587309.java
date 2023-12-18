import java.util.*;import java.io.*;import java.math.*;
public class Main{
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          System.out.println(0);
          sc = new Scanner(System.in);
          String last = sc.next();
          if(last.equals("Vacant")){
            return;
          }
          System.out.println(N - 1);
          last = sc.next();
          if(last.equals("Vacant")){
            return;
          }
          int L = 0;
          int R = N - 1;
          int C = (R + L) / 2;
          System.out.println(C);
          String res = sc.next();
            while(true){
          		if(res.equals("Vacant")){
                  return;
                }else if((C - L) % 2 == 0){
                  if(res.equals(last)){
                    L = C;
                    last = res;
                  }else{
                    R = C - 1;
                  }
                }else{
                  if(res.equals(last)){
                    R = C - 1;
                  }else{
                    L = C;
                    last = res;
                  }
                }
              C = (R + L) / 2;
              System.out.println(C);
              sc = new Scanner(System.in);
              res = sc.next();
            }
        }
}
