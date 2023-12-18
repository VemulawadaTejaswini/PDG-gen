import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bingo = new int[3][3];
        for(int i = 0; i < 9; i++)
          bingo[i/3][i%3] = Integer.parseInt(sc.next());
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
          int num = Integer.parseInt(sc.next());
          for(int j = 0; j < 9; j++){
            if(bingo[j/3][j%3] == num){
              bingo[j/3][j%3] = -1;
            }
          }
        }
        culc(bingo);
    }

    public static void culc(int[][] bingo){
      boolean judge = false;
      for(int i = 0; i < 3; i++){
        if(bingo[i][0] == -1 && bingo[i][1] == -1 && bingo[i][2] == -1){
          judge = true;
          break;
        }
        if(bingo[0][i] == -1 && bingo[1][i] == -1 && bingo[2][i] == -1){
          judge = true;
          break;
        }
      }

      if(bingo[0][0] == -1 && bingo[1][1] == -1 && bingo[2][2] == -1)
        judge = true;
      if(bingo[2][0] == -1 && bingo[1][1] == -1 && bingo[0][2] == -1)
        judge = true;

      if(judge == false)
        System.out.println("No");
      else
        System.out.println("Yes");
    }
}