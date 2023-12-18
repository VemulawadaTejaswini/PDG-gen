import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String tmp;
    String grid[][] = new String[N][M];
    for(int i=0;i<N;i++){
      
        tmp=sc.next();
      for(int j=0;j<M;j++){
        grid[i][j]=tmp.substring(j,j+1);
      }
    }
    
    //まず全行削る
    for(int i=0;i<N;i++){
      if(isVanish(grid,"gyo",i,N,M)){
        for(int j=0;j<M;j++){
        grid[i][j]="G";
        }
      }
    }
    //全列削る
    for(int i=0;i<M;i++){
      if(isVanish(grid,"retsu",i,N,M)){
        for(int j=0;j<N;j++){
        grid[j][i]="G";
        }
      }
    }
    boolean isNotG = false;
    for(int i=0;i<N;i++){
      isNotG = false;
      for(int j=0;j<M;j++){
        if(grid[i][j].equals("G")){
        System.out.print("");
        }else{        
        System.out.print(grid[i][j]);
          isNotG=true;
        }
      }
      if(isNotG){
      System.out.println("");
      }
      
    } 
  }
  //与えられた数字とグリッドに対して、num番目の行or列が全部白or灰だったらtrueを返すメソッド
  public static boolean isVanish(String grid[][],String type,int num,int N ,int M){
    if(type.equals("gyo")){
      for(int i=0;i<M;i++){
        if(grid[num][i].equals("#")){
          return false;
        }
      }
    }else{
      for(int i=0;i<N;i++){
        if(grid[i][num].equals("#")){
          return false;
        }
      }
    } 
    return true;
  }
}