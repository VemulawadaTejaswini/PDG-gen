import java.util.Scanner;

public class Main{
  static int a, b, c, d, e, f;
  static final boolean DEBUG = false;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    e = sc.nextInt();
    f = sc.nextInt();

    int amount = 0, sum = 0, prob = 0;
    for(int i = 0; i * (100 * a) <= f; i++){
      for(int j = 0; i * (100 * a) + j * (100 * b) <= f; j++){
        int water = i * (100 * a) + j * (100 * b);
        if(water == 0){
          continue;
        }
        for(int k = 0; k * c + water <= f; k++){
          int r = f - (k * c + water);
          int low = 0, high = r / d + 1;
          while(high - low > 1){
            int mid = (low + high) / 2;
            int s = k * c + mid * d;
            if(water + s <= f && 
                s * 100 <= e * water){
              low = mid;
            }
            else{
              high = mid;
            }
          }
          int sugar = k * c + low * d;
          if(water + sugar <= f && 
              water + sugar == 0 || 
              sugar * 100 > e * water){
            continue;
          }
          int p = (100 * sugar) / (water + sugar);
          if(prob < p){
            prob = p;
            amount = sugar + water;
            sum = sugar;
            if(DEBUG){
              System.out.println("water = " + water + " sugar = " + sugar);
              System.out.println(i + " " + j + " " + k + " " + low);
            }
          }
        }
      }
    }

    System.out.println(amount + " " + sum);
  }
}
