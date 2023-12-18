import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[][] val = new int[N][2];
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      val[i][0] = Integer.parseInt(S[0]);
      val[i][1] = Integer.parseInt(S[1]);
    }
    double max = 0.0;
    for(int i = 0; i < N-1; i++){
      for(int j = i+1; j < N; j++){
        double A = Math.pow(val[j][0]-val[i][0], 2);
        double B = Math.pow(val[j][1]-val[i][1], 2);
        double D = Math.sqrt(A+B);
        if(max < D){
          max = D;
        }
      }
    }
    System.out.println(max/2);
  }
}