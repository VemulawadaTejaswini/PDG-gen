import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.Arrays;
public class Main {
  public static void main (String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] colorArray = br.readLine().split(" ");
    String[] cntArray = br.readLine().split(" ");
    int[] icntArray = Stream.of(cntArray).mapToInt(Integer::parseInt).toArray();
    String rmColor = br.readLine();
    if(colorArray[0].equals(rmColor)){
      icntArray[0]-=1;
    }else if(colorArray[1].equals(rmColor)){
      icntArray[1]-=1;
    }
    System.out.print(icntArray[0] + " " + icntArray[1]);
  }
}