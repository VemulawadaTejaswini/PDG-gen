import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();
    String S = "";
    for(int i = 0;i < tx - sx;i++){
      S += "R";
    }
    for(int j = 0;j < ty - sy;j++){
      S += "U";
    }
    for(int k = 0;k < tx - sx;k++){
      S += "L";
    }
    for(int l = 0;l < ty - sy;l++){
      S += "D";
    }
    S += "D";
    for(int m = 0;m < tx - sx + 1;m++){
      S += "R";
    }
    for(int n = 0;n < ty - sy + 1;n++){
      S += "U";
    }
    S += "LU";
    for(int o = 0;o < tx - sx + 1;o++){
      S += "L";
    }
    for(int p = 0;p < ty - sy + 1;p++){
      S += "D";
    }
    S += "R";
    System.out.println(S);
  }
}
