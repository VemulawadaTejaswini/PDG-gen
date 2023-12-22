import java.util.Scanner;

public class Main {

    public Main() {
    }

    private Scanner sc;

    public static void main(String[] args) {
        new Main().solve();
    }

    private void solve() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        MyQueue queue = new MyQueue();
        for (int i = 0; i < n; i++) {
            Query qry = new Query(sc.next(), sc.nextInt());
            queue.enqueue(qry);
        }
        int sum = 0;
        while (!queue.isEmpty()) {
            Query now = (Query) queue.dequeue();
            if (now.time <= q) {
                sum += now.time;
                System.out.println(now.name + " " + sum);
            } else {
                now.time -= q;
                sum += q;
                queue.enqueue(now);
            }
        }

    }
}

class MyQueue {
    private int top;
    private int tail;
    private Object[] arr;

    public MyQueue() {
        top = 0;
        tail = -1;
        arr = new Object[1000000];
    }

    public void enqueue(Object o) {
        tail++;
        arr[tail] = o;
    }

    public Object dequeue() {
        Object r = arr[top];
        top++;
        return r;
    }

    public boolean isEmpty() {
        return top > tail;
    }
}

class Query {
    String name;
    int time;

    public Query(String name, int time) {
        super();
        this.name = name;
        this.time = time;
    }
}