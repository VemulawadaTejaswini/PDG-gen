import java.util.*;

class process {
  private String name;
  private int time;

  public process(String name,int time){
    this.name = name;
    this.time = time;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public int getTime() {
    return time;
  }
}


public class Main {
  int length, front, rear;
  process[] queue;

  // ??????????????????????????????????????????????????????????????????
  Main(int len) {
    queue = new process[len];
  }

  // ??????????????¨????????\???
  void enqueue(process val) {
    if (queue.length == length) {
      System.out.println("Fatal error: the queue is full.");
      System.exit(1);
    }

    queue[rear] = val;
    rear = (rear+1)%queue.length;
    length++;
  }

  // ????????????????????\???
  process dequeue() {
    if (length == 0) {
      System.out.println("Fatal error: the queue is empty.");
      System.exit(1);
    }

    process ret = queue[front];
    front = (front+1)%queue.length;
    length--;
    return ret;
  }

  // main ????????????
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();

    Main queue = new Main(n);
    for (int i=0; i<n; i++) {
      queue.enqueue(new process(sc.next(), Integer.parseInt(sc.next())));
    }
    Main result = new Main(n);

    int elapsed = 0;
    int n_ = n;
    while (n > 0) {
      process p = queue.dequeue();
      if (p.getTime() - q <= 0) {
        elapsed += p.getTime();
        result.enqueue(new process(p.getName(), elapsed));
        n--;
      } else {
        elapsed += q;
        queue.enqueue(new process(p.getName(), p.getTime()-q));
      }
    }

    while (n_-- > 0) {
      process r = result.dequeue();
      System.out.println(r.getName() + " " + String.valueOf(r.getTime()));
    }
  }
}