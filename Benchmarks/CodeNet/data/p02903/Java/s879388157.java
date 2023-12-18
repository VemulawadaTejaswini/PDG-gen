import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int H = Integer.parseInt(sc.next());
    int W = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int[][] field = new int[H][W];
    
    for(int i = 0; i < H; i++){
      boolean c = true;
      for(int j = 0; j < W; j++){
        if((i < B && j < A) || (i >= B && j >= A)){
          field[i][j] = 0;
        }else{
          field[i][j] = 1;
        }
      }
    }

    
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(j == W-1){
          System.out.println(field[i][j]);
        }else{
          System.out.print(field[i][j]);
          System.out.print(" ");
        }
      }
    }
  }
}