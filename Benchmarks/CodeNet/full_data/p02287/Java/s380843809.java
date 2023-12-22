import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  private void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int heapSize = Integer.parseInt(br.readLine());
      String[] keys = br.readLine().split(" ");
      long[] heap = new long[heapSize+1];
      Arrays.fill(heap, Long.MIN_VALUE);
      for(int i=1; i<=heapSize; i++)
        heap[i] = Integer.parseInt( keys[i-1] );

      StringBuilder buf = new StringBuilder();
      for(int i=1; i<=heapSize; i++){
        buf.append("node " + i + ": key = " + heap[i] + ", ");
        if( i != 1 ) buf.append("parent key = " + heap[i/2] + ", ");
        if( i*2 <= heapSize) {
          buf.append("left key = " + heap[i*2] + ", ");
          if( i*2+1 <= heapSize) {
            buf.append("right key = " + heap[i*2+1] + ", ");
          }
        }
        buf.append("\n");
      }

      System.out.println(buf);
    } catch(IOException e) {
      System.out.println("IOException!");
    }
  }
}
