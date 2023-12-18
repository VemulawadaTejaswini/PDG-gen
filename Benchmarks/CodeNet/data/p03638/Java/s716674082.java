import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int W = Integer.parseInt(S[1]);
    int N = Integer.parseInt(sc.nextLine());
    int[][] field = new int[H][W];
    
    int count = 0;
    int now = Integer.parseInt(sc.next());
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(count == now){
          now = Integer.parseInt(sc.next());
          count = 0;
        }
        if(i%2 == 0){
          field[i][j] = now;
        }else{
          field[i][W-j-1] = now;
        }
        count++;
      }
    }
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(j == W-1){
          System.out.println(field[i][j]);
        }else{
          System.out.print(field[i][j]+" ");
        }
      }
    }
  }
}