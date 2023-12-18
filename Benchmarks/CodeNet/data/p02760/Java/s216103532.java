import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int[][] bingo = new int[3][3];
    String[] line;
    
    for(int i=0; i<3; i++){
      line = br.readLine().split(" ");
      for (int j=0; j<3; j++){
        bingo[i][j] = Integer.parseInt(line[j]);
      }
    }
    int n = Integer.parseInt(br.readLine());
    int num;
    for (int i=0; i<n; i++){
      num = Integer.parseInt(br.readLine());
      for (int j=0; j<3; j++){
        for (int k=0; k<3; k++){
          if (bingo[j][k] == num) bingo[j][k] = 0;
        }
      }
    }
    for (int i=0; i<3; i++){
      if (bingo[i][0] == bingo[i][1] && bingo[i][1] == bingo[i][2] && bingo[i][0] == 0){
        System.out.println("Yes");
        return;
      }
      if (bingo[0][i] == bingo[1][i] && bingo[1][i] == bingo[2][i] && bingo[0][i] == 0){
        System.out.println("Yes");
        return;
      }
    }
    if (bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0 ||
    bingo[0][2] == 0 && bingo[1][1] == 0 && bingo[2][0] == 0){
      System.out.println("Yes");
      return;
    }
    System.out.println("No");
  }
}