import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();
    for(int i = 0;i < tx - sx;i++){
      System.out.println("R");
    }
    for(int j = 0;j < ty - sy;j++){
      System.out.println("U");
    }
    for(int k = 0;k < tx - sx;k++){
      System.out.println("L");
    }
    for(int l = 0;l < ty - sy;l++){
      System.out.println("D");
    }
    System.out.println("D");
    for(int m = 0;m < tx - sx + 1;m++){
      System.out.println("R");
    }
    for(int n = 0;n < ty - sy + 1;n++){
      System.out.println("U");
    }
    System.out.println("LU");
    for(int o = 0;o < tx - sx + 1;o++){
      System.out.println("L");
    }
    for(int p = 0;p < ty - sy + 1;p++){
      System.out.println("D");
    }
    System.out.println("R");
  }
}
