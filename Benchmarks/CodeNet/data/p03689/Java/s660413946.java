import java.util.*;
import java.io.*;
import java.math.*;

public class Main{

  public static boolean checkKernel(long[][] rect, long H, long W, long h, long w){
    for(int i=0;i<H-h+1;i++){
      for(int j=0;j<W-w+1;j++){
        long sum = 0;
        for(int k=i;k<i+h;k++){
          for(int l=j;l<j+w;l++){
            sum+=rect[k][l];
          }
        }
        if (sum>=0) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    Integer[] HWhw = Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

    int H = HWhw[0];
    int W = HWhw[1];
    int h = HWhw[2];
    int w = HWhw[3];

    long[][] rect = new long[H][W];
    long[][] kernel = new long[h][w];

    rect[H/2][W/2]=1;

    long[][] gauss = new long[H][W];

    for(int i=0;i<H-h+1;i++){
      for(int j=0;j<W-w+1;j++){
        for(int k=i;k<i+h;k++){
          for(int l=j;l<j+w;l++){
            gauss[k][l]++;
          }
        }
      }
    }

    for(int i=0;i<H-h+1;i++){
      for(int j=0;j<W-w+1;j++){
        for(int k=i;k<i+h;k++){
          for(int l=j;l<j+w;l++){
            for(int m=i;m<i+h;m++){
              for(int n=j;n<j+w;n++){
                if(gauss[m][n]<gauss[k][l]){
                  rect[m][n]++;
                  rect[k][l]--;
                }
              }
            }
          }
        }
      }
    }

    if (checkKernel(rect, H, W, h, w)) {
      System.out.println("YES");
      for(int i=0;i<H;i++){
        for(int j=0;j<W;j++){
          System.out.print(rect[i][j]+" ");
        }
        System.out.println();
      }
    }else{
      System.out.println("NO");
    }
  }
}
