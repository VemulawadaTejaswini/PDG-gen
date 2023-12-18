import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    int[][] a=new int[h][w];
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<w+1;i++){
      System.out.print("#");
    }
    System.out.println("#");
    for(int i=0;i<h;i++){
      System.out.print("#");
      for(int j=0;j<w;j++){
        System.out.print(a[i][j]);
      }
      System.out.println("#");
    }
  }
}