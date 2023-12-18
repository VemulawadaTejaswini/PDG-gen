import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long l = scan.nextLong();
    long r = scan.nextLong();

    if (l == 0){
      System.out.println(0);
      return;
    }

    if (r-l >= 2018){
      System.out.println(0);
      return;
    }

    int a1 = (int) l%2019;
    int a2 = (int) r%2019;
    
    int small = 2019;
    for (int j=a1; j < a2; j++){
      for (int k = j+1;k<=a2;k++){
        int kk = (int) (j*k)%2019;
        if (kk<small){
          small = kk;
        }
      }
    }

    System.out.println(small%2019);
  }

}
