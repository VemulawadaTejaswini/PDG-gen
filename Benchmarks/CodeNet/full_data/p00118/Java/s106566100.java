import java.util.*;
public class Main {
  public static byte M;
  public static byte N;
    public static void main(String[] a) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(true){
            M = scan.nextByte();
            N = scan.nextByte();
            if(N ==0 && M ==0){break;}
            byte ans =0;
            //if(M==1&&N==0){System.out.println(ans);continue;}
            scan.nextLine();
            char [][] field =new char[M][N];
            for(byte i=0;i<M;i++){
             String line = scan.nextLine();
                for(byte j=0;j<N;j++){
                    field[i][j] = line.charAt(j);
                }
            }
            for(byte i=0;i<M;i++){
                for(byte j=0;j<N;j++){
                    if(field[i][j] != '.'){
                        ++ans;
                        dfs(i,j,field);
 
                    }
                }
            }
            System.out.println(ans);
    }
}
  public static void dfs(byte  y,byte x,char [][] field){
      char crop = field[y][x];
      field[y][x] = '.';
          if(0<=x+1&& x+1 < N &&0<=y&& y <M  && field[y][x+1]==crop)
              dfs((byte)y,(byte)(x+1),field);
          if(0<=x&& x < N &&0<=y+1&& y+1 <M  && field[y+1][x]==crop)
              dfs((byte)(y+1),(byte)x,field);
          if(0<=x-1&& x-1 < N &&0<=y&& y <M  && field[y][x-1]==crop)
              dfs((byte)y,(byte)(x-1),field);
          if(0<=x&& x < N &&0<=y-1&& y-1 <M  && field[y-1][x]==crop)
              dfs((byte)(y-1),(byte)x,field);
  }
}