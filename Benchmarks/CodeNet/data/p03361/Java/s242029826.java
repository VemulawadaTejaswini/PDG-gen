import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int vertical = Integer.parseInt(line1[0]);
    int horizontal = Integer.parseInt(line1[1]);
    
    boolean[][] square = new boolean[vertical+2][horizontal+2];
    char[] data;
    
    for(int i=0; i<vertical; i++){
      data = br.readLine().toCharArray();
      for(int j=0; j<horizontal; j++){
        square[i+1][j+1] = (data[j] == '#');
      }
    }
    for(int i=0; i<horizontal+2; i++){
      square[0][i] = false;
      square[vertical+1][i] = false;
    }
    for(int i=0; i<vertical+2; i++){
      square[i][0] = false;
      square[i][horizontal+1] = false;
    }
    for(int i=0; i<vertical; i++){
      for (int j=0; j<horizontal; j++){
        if(square[i+1][j+1] && (!square[i+1][j] && !square[i+1][j+2] && !square[i][j+1] && !square[i+2][j+1])){
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }
}