import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int f = sc.nextInt();
    int r = sc.nextInt();

    int mf = m + f;

    if(m < -1 || m > 50 || f < -1 || f > 50 || r < -1 || r > 100){
      System.exit(1);
    }

    if(m == -1 || f == -1){
      System.out.println("F");
    }else if(mf >= 80){
      System.out.println("A");
    }else if(mf >= 65){
      System.out.println("B");
    }else if(mf >= 50){
      System.out.println("C");
    }else if(mf >= 30){
      if(r >= 50){
        System.out.println("C");
      }else{
        System.out.println("D");
      }
    }else{
      System.out.println("F");
    }
  }
}