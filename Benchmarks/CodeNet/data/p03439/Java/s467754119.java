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
                }else if(res.equals("Male")){
                  if(last.equals("Male")){
                    R = C;
                  }else{
                    L = C;
                  }
                }else{
                  if(last.equals("Female")){
                    R = C;
                  }else{
                    L = C;
                  }
                }
              last = res;
              C = (R + L) / 2;
              System.out.println(C);
              sc = new Scanner(System.in);
              res = sc.next();
            }
        }
}
