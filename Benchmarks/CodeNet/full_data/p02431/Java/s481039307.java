import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int q = Integer.parseInt(br.readLine());
      List<String> vector = new ArrayList<>();

      String[] query;
      int op;
      Integer num;
      for ( int i=0; i<q; i++ ){
        query = br.readLine().split(" ");

        switch(query[0]) {
          case "0" :
            vector.add(query[1]);
            break;
          case "1" :
            System.out.println( vector.get(Integer.parseInt(query[1])) );
            break;
          case "2" :
            vector.remove(vector.size()-1);
            break;
          default:
        }
      }
    }
  }
}
