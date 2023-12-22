import java.util.Scanner;

public class Main {
	public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int X = sc.nextInt();
      int[][] c = new int[N][M+1];
      for (int i =0; i<N; i++) {
        for (int j =0; j<M+1; j++) {
          c[i][j] = sc.nextInt();
        }
      }
      int total = -1;
      for (int i =1; i<M+1; i++) {
        int jtotal =0;
        for (int j =0; j<N; j++) {
          jtotal += c[j][i];
        }
        if (jtotal < X) {
          total = -1; 
        }
      }
      int check = 0;
      for (int i =0; i<N; i++) {
        for (int j =1; j<M+1; j++) {
        if (c[i][j] >= X) check++;
        }
        if (check == M) total = c[i][0];
        check =0;
      }   
      for (int i =0; i<N; i++) {
        for (int k =i+1; k<N; k++) {
          for (int j =1; j<M+1; j++) {
        if (c[i][j]+ c[k][j] >= X) check++;
          }
        if (check == M) total = c[i][0]+c[k][0];
        check =0;
        }
      }   
      System.out.println(total);
    }
}