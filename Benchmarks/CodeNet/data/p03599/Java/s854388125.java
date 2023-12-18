import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();
    int F = sc.nextInt();

    double max = -1;
    int maxSugar = 0;
    int maxSugarWater = 0;
    for (int i = 0; i*100 <= F; i++) {
      for (int m = 0; m*A*100 <= i*100; m++) {
        if ((i-m*A)%B == 0) {
          int n = (i-m*A)/B;
          for (int p = 0; p*C <= i*E; p++) {
            int q = (i*E-p*C) / D;
            int sugar = p*C + q*D;
            int sugarWater = sugar + m*A*100 + n*B*100;
            if (sugarWater == 0){
              continue;
            }
            double v = (double) 100*sugar/sugarWater;
            if (sugarWater <= F && max < v) {
              max = v;
              maxSugar = sugar;
              maxSugarWater = sugarWater;
            }
          }
        }
      }
    }
    
    System.out.println(maxSugarWater + " " + maxSugar);
  }
