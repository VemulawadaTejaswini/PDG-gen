import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int point[][] = new int[w][h];
    int x[] = new int[w];
    int y[] = new int[h];
    int a[] = new int[n];
    int s = 0;
    for(int i = 0;i < w;i++){
      for(int j = 0;i < h;j++){
        point[i][j] = 0;
      }
    }
    for(int i = 0;i < n;i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      a[i] = sc.nextInt();
    }
    for(int i = 0;i < n;i++){
      if(a[i] == 1){
        for(int j = 0;j < x[i];j++){
          for(int k = 0;k < h;k++){
            point[j][k] = 1;
          }
        }
      }else if(a[i] == 2){
        for(int j = x[i];j < w;j++){
          for(int k = 0;k < h;k++){
            point[j][k] = 1;
          }
        }
      }else if(a[i] == 3){
        for(int j = 0;j < w;j++){
          for(int k = 0;k < y[i];k++){
            point[j][k] = 1;
          }
        }
      }else if(a[i] == 4){
        for(int j = 0;j < w;j++){
          for(int k = y[i];k < h;k++){
            point[j][k] = 1;
          }
        }
      }
    }
    for(int i = 0;i < w;i++){
      for(int j = 0;j < h;j++){
        if(point[i][j] == 0){
          s++;
        }
      }
    }
    System.out.println(s);
  }
}
