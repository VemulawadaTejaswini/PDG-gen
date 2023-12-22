import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  private void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      final int MAX_INPUT_SIZE = 2_000_000;
      PriorityQueue queue = new PriorityQueue(MAX_INPUT_SIZE);
      boolean isContinue = true;
      String[] order;
      StringBuilder buf = new StringBuilder(MAX_INPUT_SIZE*5);

      while(isContinue) {
        order = br.readLine().split(" ");

        switch( order[0] ) {
          case "insert" :
            queue.insert(Integer.parseInt(order[1]));
            break;
          case "extract" :
            buf.append( queue.extract() ).append("\n");
            break;
          case "end" :
            buf.setLength(buf.length()-1);
            isContinue = false;
            break;
          default :
        }
      }

      System.out.println(buf);

    } catch(IOException e) {
      System.out.println("IOException!");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("heap index out of bounds!");
    } catch(BufferUnderflowException e) {
      System.out.println("heap underflow!");
    } catch(IllegalArgumentException e) {
      System.out.println("new key is smaler than current key!");
    }
  }
}

class PriorityQueue {

  int[] heap;
  int tail;

  public PriorityQueue(int size) {
    heap = new int[size+1];
    tail = 0;
  }

  public void insert(int key) {
    heap[++tail] = Integer.MIN_VALUE;
    heapIncreaseKey(tail, key);
  }
  public int extract() {
    return heapExtractMax();
  }

  private void heapIncreaseKey(int id, int key) {
    if( key < heap[id] ) throw new IllegalArgumentException();

    int t;
    heap[id] = key;
    while( (id > 1) && (heap[parent(id)] < heap[id]) ){
      t = heap[id]; heap[id] = heap[parent(id)]; heap[parent(id)] = t;
      id = parent(id);
    }
  }
  private int heapExtractMax() {
    if(tail < 1) throw new BufferUnderflowException();

    int max = heap[1];
    heap[1] = heap[tail--];
    maxHeapify(1);

    return max;
  }
  private void maxHeapify(int id) {
    int t,left,right,largest;
    left  = nodeLeft(id);
    right = nodeRight(id);

    if( (left <= tail) && (heap[left] > heap[id]) )
      largest = left;
    else
      largest = id;
    if( (right <= tail) && (heap[right] > heap[largest]) )
      largest = right;

    if( largest != id ) {
      t = heap[id]; heap[id] = heap[largest]; heap[largest] = t;

      maxHeapify(largest);
    }
  }
  private int parent(int id) {
    return id/2;
  }
  private int nodeLeft(int id) {
    return id*2;
  }
  private int nodeRight(int id) {
    return id*2+1;
  }
}
