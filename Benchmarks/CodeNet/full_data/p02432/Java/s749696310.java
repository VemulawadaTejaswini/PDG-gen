import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int q = Integer.parseInt(br.readLine());
      List<String> list = new ArrayList<>();

      String[] query;
      for ( int i=0; i<q; i++ ){
        query = br.readLine().split(" ");

        switch(query[0]) {
          case "0" :
            if ( query[1].equals("1") )
              list.add(query[2]);
            else
              list.add(0,query[2]);
            break;
          case "1" :
            System.out.println( list.get(Integer.parseInt(query[1])) );
            break;
          case "2" :
            if ( query[1].equals("1") )
              list.remove(list.size()-1);
            else
              list.remove(0);
            break;
          default:
        }
      }
    }
  }
}
