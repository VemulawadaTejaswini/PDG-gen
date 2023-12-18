import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] ab = new int[m][2];
    for(int i = 0; i<m; i++){
      ab[i][0] = sc.nextInt();
      ab[i][1] = sc.nextInt();
    }
    for(int i = 0; i<m; i++){
      if(ab[i][0] == 1){
        for(int j = 0; j<m; j++){
          if((ab[j][0] == ab[i][1]) && (ab[j][1] == n)){
            System.out.println("POSSIBLE");
            return;
          }
        }
      }
    }
    System.out.println("IMPOSSIBLE");
  }
}
