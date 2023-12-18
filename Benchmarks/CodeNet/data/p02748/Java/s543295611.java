import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int aa[] = new int[a];
    int bb[] = new int[b];
    for(int i = 0;i<a;i++){
      aa[i] = Integer.parseInt(sc.next());
    }
    for(int i = 0;i<b;i++){
      bb[i] = Integer.parseInt(sc.next());
    }
    int x[] = new int[m];
    int y[] = new int[m];
    int c[] = new int[m];
    for(int i = 0;i<m;i++){
      x[i] = Integer.parseInt(sc.next());
      y[i] = Integer.parseInt(sc.next());
      c[i] = Integer.parseInt(sc.next());
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
      xx = x[i];
      yy = y[i];
      ittann[xx][yy] = ab[xx][yy] - c[i];
      if(ab[xx][yy] > ittann[xx][yy]){
        ab[xx][yy] = ittann[xx][yy];
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
