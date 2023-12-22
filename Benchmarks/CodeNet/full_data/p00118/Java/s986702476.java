import java.io.*;
import java.util.*;
import java.math.*;
public class Main { 
    public static void main(String[] args) throws java.io.IOException{ 
        Scanner scan = new Scanner(System.in);
        
        while(true){
            int M = scan.nextInt();
            int N = scan.nextInt();
            if(N==0 && M ==0)break;
            int ans =0;
            char [][] field =new char[M][N];
            for(int i=0;i<M;i++){
                for(int j=0;j<N;j++){
                    field[i][j] = scan.nextByte();
                }
                scan.skip("\n");
            }

            for(int i=0;i<M;i++){
                for(int j=0;j<N;j++){
                    if(field[i][j] != '.'){
                        dfs(i,j,field);
                        ans++;
                    }
                }
            }
            System.out.println(ans);
    }


}
  public static void dfs(int x,int y,char [][] field){
      char crop = field[y][x];
      field[y][x] = '.';
      int  [] dx= {1,0,-1,0};
      
      for(int i=0;i<3;i++){
          int nx = x+dx;
          int ny = x + dx^1;
          if(0<=nx 
            && nx < N 
            &&0<=ny 
            &&ny <M 
            && field[ny][nx].equals(crop)){
              dfs(ny,nx,field);
          }
      }
  }
}