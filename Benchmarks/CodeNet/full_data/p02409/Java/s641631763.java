import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][][] mem = new int[4][3][10];
    int n = sc.nextInt(),b,f,r,v;
    for(int i = 0;i < 4;i++){
      for(int j = 0;j < 3;j++){
        for(int k = 0;k < 10;k++){
          mem[i][j][k]=0;
        }
      }
    }
    for(int i=0;i < n;i++){
      b = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      v = sc.nextInt();
      mem[b-1][f-1][r-1] += v;
    }
    for(int i = 0;i < 4;i++){
      for(int j = 0;j < 3;j++){
        for(int k = 0;k < 10;k++){
          System.out.print(" " + mem[i][j][k]);
        }
        System.out.println("");
      }
      System.out.println("####################");
    }
    sc.close();
  }
}
