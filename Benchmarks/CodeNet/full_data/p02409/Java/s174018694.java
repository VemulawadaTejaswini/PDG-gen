import java.util.Scanner;

public class Main {
  public static void PrintArray(int[][]A, int a, int b){
    for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
        System.out.print(" " + A[i][j]);
      }
      System.out.println();
    }
  }
  public static void PrintHash(int n){
    for(int i=0;i<n;i++){
      System.out.print("#");
    }
    System.out.println();
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [][] A = new int[3][10];
    int [][] B = new int[3][10];
    int [][] C = new int[3][10];
    int [][] D = new int[3][10];
    int b, f, r, v;
    while(sc.hasNext()){
      int n = sc.nextInt();
      for(int i=0;i<n;i++){
        b = sc.nextInt();
        f = sc.nextInt();
        r = sc.nextInt();
        v = sc.nextInt();
        
        switch(b){
          case 1:
            A[f-1][r-1] += v;
            break;
          case 2:
            B[f-1][r-1] += v;
            break;
          case 3:
            C[f-1][r-1] += v;
            break;
          case 4:
            D[f-1][r-1] += v;
            break;
          default:
            break;
        }
      }
      PrintArray(A, 3, 10);
      PrintHash(20);
      PrintArray(B, 3, 10);
      PrintHash(20);
      PrintArray(C, 3, 10);
      PrintHash(20);
      PrintArray(D, 3, 10);
    }
    sc.close();
  }
}
