import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String[] s = sc.nextLine().split(" ");
    int H = Integer.parseInt(s[0]);
    int W = Integer.parseInt(s[1]);
    
    char[][] field = new char[H][W];
    for(int i = 0; i < H; i++){
      String str = sc.nextLine();
      field[i] = str.toCharArray();
    }
    
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        int count = 0;
        if(field[i][j] == '.'){
          if(i == 0 && j == 0){
            if(field[i+1][j] == '#'){
              count++;
            }
            if(field[i][j+1] == '#'){
              count++;
            }
            if(field[i+1][j+1] == '#'){
              count++;
            }
          }
          else if(i == 0 && j == W-1){
            if(field[i][j-1] == '#'){
              count++;
            }
            if(field[i+1][j-1] == '#'){
              count++;
            }
            if(field[i+1][j] == '#'){
              count++;
            }
          }
          else if(i == H-1 && j == 0){
            if(field[i-1][j] == '#'){
              count++;
            }
            if(field[i-1][j+1] == '#'){
              count++;
            }
            if(field[i][j+1] == '#'){
              count++;
            }
          }
          else if(i == H-1 && j == W-1){
            if(field[i-1][j] == '#'){
              count++;
            }
            if(field[i-1][j-1] == '#'){
              count++;
            }
            if(field[i][j-1] == '#'){
              count++;
            }
          }
          else if(i == 0){
            if(field[i][j-1] == '#'){
              count++;
            }
            if(field[i+1][j-1] == '#'){
              count++;
            }
            if(field[i+1][j] == '#'){
              count++;
            }
            if(field[i+1][j+1] == '#'){
              count++;
            }
            if(field[i][j+1] == '#'){
              count++;
            }
          }
          else if(i == H-1){
            if(field[i][j-1] == '#'){
              count++;
            }
            if(field[i-1][j-1] == '#'){
              count++;
            }
            if(field[i-1][j] == '#'){
              count++;
            }
            if(field[i-1][j+1] == '#'){
              count++;
            }
            if(field[i][j+1] == '#'){
              count++;
            }
          }
          else if(j == 0){
            if(field[i-1][j] == '#'){
              count++;
            }
            if(field[i-1][j+1] == '#'){
              count++;
            }
            if(field[i][j+1] == '#'){
              count++;
            }
            if(field[i+1][j+1] == '#'){
              count++;
            }
            if(field[i+1][j] == '#'){
              count++;
            }
          }
          else if(j == W-1){
            if(field[i-1][j] == '#'){
              count++;
            }
            if(field[i-1][j-1] == '#'){
              count++;
            }
            if(field[i][j-1] == '#'){
              count++;
            }
            if(field[i+1][j-1] == '#'){
              count++;
            }
            if(field[i+1][j] == '#'){
              count++;
            }
          }
          else{
            if(field[i-1][j-1] == '#'){
              count++;
            }
            if(field[i-1][j] == '#'){
              count++;
            }
            if(field[i-1][j+1] == '#'){
              count++;
            }
            if(field[i][j-1] == '#'){
              count++;
            }
            if(field[i][j+1] == '#'){
              count++;
            }
           	if(field[i+1][j-1] == '#'){
              count++;
            }
            if(field[i+1][j] == '#'){
              count++;
            }
            if(field[i+1][j+1] == '#'){
              count++;
            }
          }
          field[i][j] = (char)(count + '0');
        }
      }
    }
    
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        System.out.print(field[i][j]);
      }
      System.out.println("");
    }
  }
}