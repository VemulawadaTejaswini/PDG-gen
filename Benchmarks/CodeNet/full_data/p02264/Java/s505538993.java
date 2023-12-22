import java.nio.*;
import java.util.*;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int n = sc.nextInt();
    int q = sc.nextInt();

    Queue queue = new Queue(n);

    String s;
    int t;
    for (int i = 0; i < n; i++) {
      s = sc.next();
      t = sc.nextInt();

      queue.enQueue(s, t);
    }

    int sum = 0;
    while (!queue.isEmpty()) {
      P p = queue.deQueue();
      if (p.t > q) {
        sum += q;
        queue.enQueue(p.s, p.t - q);
      } else {
        sum += p.t;
        System.out.println(p.s + " " + sum);
      }
    }

    sc.close();
  }
}

class P {
  public String s;
  public int t;

  public P(String s, int t) {
    this.s = s;
    this.t = t;
  }
}

class Queue {
  private int head = 0;
  private int tail = 0;
  private P[] p;

  public Queue(int n) {
    this.p = new P[n + 1];
  }

  public boolean isEmpty() {
    return this.head == this.tail;
  }

  public boolean isFull() {
    return this.head == (this.tail + 1) % this.p.length;
  }

  public void enQueue(String s, int t) throws Exception {
    if (this.isFull()) {
      throw new Exception();
    }

    this.p[this.tail] = new P(s, t);

    if (this.tail + 1 == this.p.length) {
      this.tail = 0;
    } else {
      this.tail++;
    }
  }

  public P deQueue() throws Exception {
    if (this.isEmpty()) {
      throw new Exception();
    }

    P p = this.p[this.head];

    if (this.head + 1 == this.p.length) {
      this.head = 0;
    } else {
      this.head++;
    }

    return p;
  }
}
