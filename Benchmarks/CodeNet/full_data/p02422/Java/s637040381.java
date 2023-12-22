import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String str = br.readLine();
      StringBuilder transStr = new StringBuilder(str);
      StringBuilder order = new StringBuilder();
      StringBuilder revese = new StringBuilder();
      int q = Integer.parseInt(br.readLine());
      int[] spaces = new int[]{0,0,0};
      int start = 0;
      int end   = 0;

      for ( int i = 0; i < q; i++ ) {

        order.append(br.readLine());
        spaces[0] = order.indexOf(" ");
        spaces[1] = order.indexOf(" ",spaces[0]+1);

        switch(order.substring(0,spaces[0])) {
          case "print" :
            start = Integer.parseInt(order.substring(spaces[0]+1,spaces[1]));
            end   = Integer.parseInt(order.substring(spaces[1]+1))+1;
            System.out.println(transStr.substring(start,end));
            break;
          case "reverse" :
            start = Integer.parseInt(order.substring(spaces[0]+1,spaces[1]));
            end   = Integer.parseInt(order.substring(spaces[1]+1))+1;
            revese.append(transStr.substring(start, end))
                  .reverse();
            transStr.replace(start, end, revese.toString());
            revese.setLength(0);
            break;
          case "replace" :
            spaces[2] = order.indexOf(" ",spaces[1]+1);
            start = Integer.parseInt(order.substring(spaces[0]+1,spaces[1]));
            end   = Integer.parseInt(order.substring(spaces[1]+1,spaces[2]))+1;
            transStr.replace(start, end, order.substring(spaces[2]+1));
            break;
          default :
            break;
        }

        order.setLength(0);
      }
    }
  }
}
