import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] s = new char[h][w];
    for (int i = 0; i<w;i++){
      s[i] = sc.next().toCharArray();
    }
    sc.close();
    
    int[] pointX = new int[]{0,0,1,-1};
    int[] pointY = new int[]{1,-1,0,0};
    boolean judge = true;
    for (int i = 0;i < h;i++){
      if (!judge){break;}
      for (int j = 0;j < w;j++){
        if (!judge){break;}
        if (s[i][j] == '#'){
          boolean islink = false;
          for (int k = 0;k<4;k++){
            int targetX = j + pointX[k];
            int targetY = i + pointY[k];
            if (targetX >= 0 && targetY >= 0 && targetX < w && targetY < h){
              if (s[targetY][targetX] == '#'){
                islink = true;
                break;
              }
            }
          }
          if (!islink){
            judge = false;
            break;
          }
        }
      }
    }
    String ans = judge ? "Yes":"No";
    System.out.println(ans);
  }
}