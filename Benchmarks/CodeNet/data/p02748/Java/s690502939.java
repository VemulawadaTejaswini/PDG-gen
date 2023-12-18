import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    int aa[] = new int[a];
    int bb[] = new int[b];
    for(int i = 0;i<a;i++){
      aa[i] = sc.nextInt();
    }
    for(int i = 0;i<b;i++){
      bb[i] = sc.nextInt();
    }
    int x[] = new int[m];
    int y[] = new int[m];
    int c[] = new int[m];
    for(int i = 0;i<m;i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    int abab = a * b;
    int ab[][] = new int[a][b];
    int count = 0;
    for(int i = 0;i<a;i++){
      for(int j = 0;j<b;j++){
        ab[i][j] = aa[i] + bb[j];
      }
    }
    int xx = 0;
    int yy = 0;
    int ittann[][] = new int[a][b];
    for(int i = 0;i<m;i++){
      xx = x[i] -1;
      yy = y[i] -1;
      if(c[i] > ittann[xx][yy]){
        ab[xx][yy] += ittann[xx][yy] - c[i];
        ittann[xx][yy] = c[i];
      }
    }
    int min = 10000000;
    for(int i = 0;i<a;i++){
      for(int j = 0;j<b;j++){
        if(min > ab[i][j]){
          min = ab[i][j];
        }
      }
    }
    System.out.println(min);
  }
}
