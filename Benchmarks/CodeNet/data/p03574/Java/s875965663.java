import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      
      char[][] chars = new char[h][w];
      
      for(int i = 0; i < h; i++) {
          chars[i] = sc.next().toCharArray();
      }

      int[] rows = new int[] { 1, -1, 0, 0, 1, -1, 1, -1};
      int[] cols = new int[] { 0, 0, -1, 1, -1, -1, 1, 1};
      for(int i = 0; i < h; i++) {
          for(int j = 0; j < w; j++) {
              int row = i;
              int col = j;
              
              if(chars[row][col] == '#') continue;
              int cnt = 0;
              for(int k = 0; k < 8; k++)  {
                  int nextRow = row + rows[k];
                  int nextCol = col + cols[k];
                  if(0 <= nextRow && nextRow < h && 0 <= nextCol && nextCol < w && chars[nextRow][nextCol] == '#')
                    cnt++;
              }
              chars[row][col] = (char)(cnt + '0');
          }
      }
      for(int i = 0; i < h; i++)
        System.out.println(new String(chars[i]));
  }
}

