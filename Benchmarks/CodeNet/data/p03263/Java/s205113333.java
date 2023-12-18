import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int w = scan.nextInt();
    int a[][] = new int[h][w];
    int ks = 0;
    int[] x = new int[h*w];
    int[] y = new int[h*w];
    int[] x1 = new int[h*w];
    int[] y1 = new int[h*w];
    for(int i = 0;i < h;i++){
      for(int j = 0; j < w;j++){
        a[i][j] = scan.nextInt();
      }
    }
    for(int i = 0;i < h;i++){
      for(int j = 0;j < w;j++){
        if(a[i][j]%2 == 1&& a[i][j] != 0){
          if(j != w-1 ){
            if(a[i][j+1]%2 == 1){
            a[i][j] -=1;
            a[i][j+1] += 1;
            x[ks] = j;
            y[ks] = i;
            x1[ks] = j+1;
            y1[ks] = i;
            ks++;
            continue;
          }
          }
          if(i != h-1 ){
            if(a[i+1][j]%2 == 1){
            a[i][j] -=1;
            a[i+1][j] += 1;
            x[ks] = j;
            y[ks] = i;
            x1[ks] = j;
            y1[ks] = i+1;
            ks++;
            continue;
          }
          }
          if(j != w-1){
          a[i][j] -=1;
          a[i][j+1] += 1;
          x[ks] = j;
          y[ks] = i;
          x1[ks] = j+1;
          y1[ks] = i;
          ks++;
          continue;
        }
        if(i != h-1 ){
          a[i][j] -=1;
          a[i+1][j] += 1;
          x[ks] = j;
          y[ks] = i;
          x1[ks] = j;
          y1[ks] = i+1;
          ks++;
          continue;
        }
      }
      }
    }
    System.out.println(ks);
    for(int i =0 ;i <ks ;i++){
      System.out.println((x[i]+1)+" "+(y[i]+1)+" "+(x1[i]+1)+" "+(y1[i]+1));
    }
  }
}