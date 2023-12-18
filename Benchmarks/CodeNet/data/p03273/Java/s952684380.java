import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int h = Integer.parseInt(line1[0]);
    int w = Integer.parseInt(line1[1]);
    
    char[][] c = new char[h][w];
    boolean[] viewLine = new boolean[h];
    boolean[] viewColumn = new boolean[w];
    
    for(int i=0; i<h; i++){
      c[i] = br.readLine().toCharArray();
    }
    for (int i=0; i<h; i++){
      for (int j=0; j<w; j++){
        if(c[i][j] == '#'){
          viewLine[i] = true;
          viewColumn[j] = true;
        }
      }
    }
    StringBuilder result =  new StringBuilder();
    for (int i=0; i<h; i++){
      if (!viewLine[i]) continue;
      for (int j=0; j<w; j++){
        if (viewColumn[j]) {
          result.append(c[i][j]);
        }
      }
      result.append("\n");
    }
    System.out.println(result.toString());
  }
}
