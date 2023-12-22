import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileStore;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      String[] order;
      StringBuilder result = new StringBuilder(n*4);
      Dictionary dict = new Dictionary(4, n);

      for(int i=0; i<n; i++) {
        order = br.readLine().split(" ");
        switch( order[0] ) {
          case "insert" :
            dict.insert(order[1]);
            break;
          case "find" :
            result.append( dict.find(order[1]) ).append("\n");
            break;
        }
      }

      System.out.print(result);
    }
  }
}

class Dictionary {
  String[][] dict2d;
  int[] pos;

  public Dictionary(int first, int second) {
    dict2d = new String[first][second];
    pos = new int[first];
  }

  public void insert(String str) {
    switch(str.substring(0,1)) {
      case "A" :
        dict2d[0][pos[0]++] = str;
        break;
      case "C" :
        dict2d[1][pos[1]++] = str;
        break;
      case "G" :
        dict2d[2][pos[2]++] = str;
        break;
      case "T" :
        dict2d[3][pos[3]++] = str;
        break;
    }
  }
  public String find(String ref) {
    boolean result = false;
    switch(ref.substring(0,1)) {
      case "A" :
        result = isExistSeachBylinear(0, ref);
        break;
      case "C" :
        result = isExistSeachBylinear(1, ref);
        break;
      case "G" :
        result = isExistSeachBylinear(2, ref);
        break;
      case "T" :
        result = isExistSeachBylinear(3, ref);
        break;
    }

    return result ? "yes" : "no";
  }
  private boolean isExistSeachBylinear(int first, String ref) {

    if(pos[first] != 0) {
      for (String s : dict2d[first]) {
        if(ref.length() == s.length())
          if(ref.equals(s)) return true;
      }
    }

    return false;
  }
}
