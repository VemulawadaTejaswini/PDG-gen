import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
  public static int M;
  public static int N;
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        Boolean flag = true;
         
        while(flag){
            M = scan.nextInt();
            N = scan.nextInt();
            System.out.println(M);System.out.println(N);
           
            if(N ==0 && M ==0){flag = false ;break;}
            int ans =0;
            scan.nextLine();
            char [][] field =new char[M][N];
            for(int i=0;i<M;i++){
             String line = scan.nextLine();
                for(int j=0;j<N;j++){
                    field[i][j] = line.charAt(j);
                }
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
  public static void dfs(int y,int x,char [][] field){
      char crop = field[y][x];
      field[y][x] = '.';
      int  [] dx= {1,0,-1,0};
    int  [] dy = {0,1,0,-1};
       
      for(int i=0;i<3;i++){
          int nx = x+dx[i];
          int ny = y + dy[i];
          if(0<=nx && nx < N &&0<=ny && ny <M  &&( field[ny][nx]==crop))
              dfs(ny,nx,field);
      }
  }
}