import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] line = br.readLine().split(" ");
      int n     = Integer.parseInt(line[0]);
      int qTime = Integer.parseInt(line[1]);
      Queue<Process> queue = new Queue<>(n*2);

      for(int i=0; i!=n; i++) {
        line = br.readLine().split(" ");
        queue.enQueue( new Process(line[0], Integer.parseInt(line[1])) );
      }

      int usingTime = 0;
      Process proc;
      StringBuilder result = new StringBuilder(n*5);

      while(!queue.isEmpty()) {
        proc = queue.deQueue();
        proc.pTime -= qTime;

        if(proc.pTime < 1) {
          usingTime += qTime + proc.pTime;
          result.append(proc.name).append(" ").append(usingTime).append("\n"); 
        } else {
          usingTime += qTime;
          queue.enQueue(proc);
        }
      }

      System.out.print(result);
    }
  }
}

class Process {
  final String name;
  int pTime;

  public Process(String name, int time) {
    this.name = name;
    this.pTime = time;
  }
}

class Queue<E> {

  private Object[] queue;
  private int head;
  private int tail;
  private int max;

  public Queue(int capacity) {
    queue = new Object[capacity];
    head = tail = 0;
    max  = queue.length;
  }

  boolean isEmpty() {
    return head == tail;
  }
  boolean isFull() {
    return head == (tail + 1) % max;
  }

  void enQueue(E x) {
    if(isFull()) System.out.println("queue is full!");

    queue[tail] = x;
    if(tail+1 == max) tail = 0;
    else tail++;
  }
  @SuppressWarnings("unchecked")
  E deQueue() {
    if(isEmpty()) {
      System.out.println("queue is empty!");
      throw new IllegalStateException("queue is empty!");
    }

    E ret = (E)queue[head];

    if(head+1 == max) head = 0;
    else head++;

    return ret;
  }
}
