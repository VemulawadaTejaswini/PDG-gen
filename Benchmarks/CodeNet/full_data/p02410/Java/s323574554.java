import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int width,height,i,j;
    height = sc.nextInt();
    width = sc.nextInt();
    int [][] a = new int[height][width];
    int [][] b = new int[width][1];
    int [][] c = new int[height][1];
    for(i = 0;i < height;i++){
      for(j = 0;j < width;j++){
        a[i][j] = sc.nextInt();
      }
    }
    for(i = 0;i < width;i++){
      b[i][0] = sc.nextInt();
    }

    for(i = 0;i < height;i++){
      for(j = 0;j < width;j++){
        c[i][0] += a[i][j] * b[j][0];
      }
    }

    for(i = 0;i < height;i++){
      System.out.println(c[i][0]);
    }
  }
}