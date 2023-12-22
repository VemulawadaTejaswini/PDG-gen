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
      Dictionary dict = new Dictionary(10_000_000);

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
  boolean[] dict;

  public Dictionary(int size) {
    dict = new boolean[size];
  }

  public void insert(String str) {
    int no   = getKey(str);
    dict[no] = true;
  }
  public String find(String ref) {
    int no = getKey(ref);

    return isExist(no) ? "yes" : "no";
  }
  private int getKey(String str) {
    int len = str.length();
    long ret = 0;
    for(int i=0,d=10; i<len; i++ ) {
      ret = (ret * d) + str1ToInt(str.substring(i,i+1));
    }
    String encode = String.valueOf(ret);
    ret = Long.parseLong(encode, 5);

    return (int)ret;
  }
  private boolean isExist(int no) {

    return dict[no];
  }
  private int str1ToInt(String s1) {

    switch( s1 ) {
      case "A" :
        return 1;
      case "C" :
        return 2;
      case "G" :
        return 3;
      case "T" :
        return 4;
      default :
        return -1;
    }

  }
}
