import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;


public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int q = Integer.parseInt(br.readLine());
      List<String> workList = new LinkedList<>();
      List<String> stockList= new LinkedList<>();
      List<String> sList;
      int p = 0;
      String[] query;

      int op,move;
      for ( int i=0; i<q; i++ ){
        query = br.readLine().split(" ");
        op  = Integer.parseInt(query[0]);

        switch( op ) {
          case 0 :
            workList.add(0,query[1]);
            break;
          case 1 :
            move = Integer.parseInt(query[1]);
            if(move < 0) {
              p += move;
              stockList.addAll(workList);
              workList = stockList;
              stockList = new LinkedList<>();
              sList = workList.subList(0, p);
              stockList.addAll(sList);
              workList.removeAll(sList);
            }
            else {
              p += move;
              sList = workList.subList(0, p);
              stockList.addAll(sList);
              sList.clear();
            }
            break;
          case 2 :
            workList.remove(0);
            break;
          default:
        }
      }
      stockList.addAll(workList);
      workList = stockList;

      workList.forEach(System.out::println);
    }
  }
}
