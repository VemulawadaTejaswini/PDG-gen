import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int w = sc.nextInt();
            boolean[][] hasBomb = new boolean[h+2][w+2];
            for(int i = 1 ;i<=h;i++){
                  String line = sc.next();
                  for(int j = 1;j<=w;j++){
                        hasBomb[i][j] = line.charAt(j-1)=='#';
                  }
            }
            for(int i = 1;i<=h;i++){
                  StringBuffer bf = new StringBuffer();
                  for (int j = 1;j<=w;j++){
                        bf.append(searchBomb(hasBomb,i,j));
                  }
                  System.out.println(bf.toString());
            }
            


            System.out.println();
      }
      public static char searchBomb(boolean[][] hasBomb,int i,int j){

            if(hasBomb[i][j]){
                  return '#';
            }
            int ans = 0;
            if (hasBomb[i-1][j-1]){
                  ans++;
            }
            if (hasBomb[i-1][j]){
                  ans++;
            }
            if (hasBomb[i-1][j+1]){
                  ans++;
            }
            if (hasBomb[i][j-1]){
                  ans++;
            }
            if (hasBomb[i][j+1]){
                  ans++;
            }
            if (hasBomb[i+1][j-1]){
                  ans++;
            }
            if (hasBomb[i+1][j]){
                  ans++;
            }
            if (hasBomb[i+1][j+1]){
                  ans++;
            }

            return Integer.toString(ans).charAt(0);
      }


}
