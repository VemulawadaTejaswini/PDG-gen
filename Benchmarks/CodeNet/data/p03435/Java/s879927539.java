import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    int[] b = new int[3];
    a[0] = 0;
    boolean judge = true;
    int[][] c = new int[3][3];
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        c[i][j] = sc.nextInt();
      }
    }
    for(int i = 0; i < 3; i++){
      b[i] = c[0][i] - a[0];
    }
    for(int i = 1; i < 3; i++){
      a[i] = c[i][0] -b[0];
    }
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        if(c[i][j] != (a[i]+b[j])){
          judge = false;
        }
      }
    }
    if(judge){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}