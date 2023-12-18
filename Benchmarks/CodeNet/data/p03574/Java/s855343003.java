import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String line[] = new String[h];
    for(int i = 0 ; i < h ; ++i){
      line[i] = sc.next();
    }
    
    int s[][] = new int[h][w];
    for(int i = 0 ; i < h ; ++i){
      for(int j = 0 ; j < w ; ++j){
        if(line[i].charAt(j) == '.'){
          s[i][j] = 0;
        }else{
          s[i][j] = -1;
        }
      }
    }
    
    //int count = 0;
    for(int i = 0 ; i < h ; ++i){
      for(int j = 0 ; j < w ; ++j){
        if(s[i][j] != -1){
          //左上
          if(i!=0 && j!=0 && s[i-1][j-1]==-1){
            s[i][j]++;
          }
          //上
          if(i!=0 && s[i-1][j]==-1){
            s[i][j]++;
          }
          //右上
          if(i!=0 && j!=w-1 && s[i-1][j+1]==-1){
            s[i][j]++;
          }
          //右
          if(j!=w-1 && s[i][j+1]==-1){
            s[i][j]++;
          }
          //右下
          if(i!=h-1 && j!=w-1 && s[i+1][j+1]==-1){
            s[i][j]++;
          }
          //下
          if(i!=h-1 && s[i+1][j]==-1){
            s[i][j]++;
          }
          //左下
          if(i!=h-1 && j!=0 && s[i+1][j-1]==-1){
            s[i][j]++;
          }
          //左
          if(j!=0 && s[i][j-1]==-1){
            s[i][j]++;
          }

        }

      }
    }
    
    for(int i = 0 ; i < h ; ++i){
      for(int j = 0 ; j < w ; ++j){
        if(s[i][j] == -1){
          System.out.print("#");
        }else{
          System.out.print(s[i][j]);
        }
        
      }
      System.out.println();
    }

  }
}