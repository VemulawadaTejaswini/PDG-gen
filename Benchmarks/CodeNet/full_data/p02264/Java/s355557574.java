import java.util.Scanner;

public class Main {
    public static int MAX = 100001;
    public static class Task{
        String name;
        int t;
    }
    public static class MyQueue {
        int head, tail = 0;
        Task[] a = new Task[MAX];
        public boolean isFull(){
            return head == (tail + 1) % MAX;
        }
        public boolean isEmpty(){
            return head == tail;
        }
        public boolean enqueue(Task s){
            if (isFull()) {
                throw new NullPointerException("queue is full");
            }
            a[tail] = s;
            if (++tail == MAX) tail = 0;
            return true;
        }
        public Task dequeue(){
            if (isEmpty()){
                throw new NullPointerException("queue is empty");
            }
            Task s = a[head];
            if (++head == MAX) head = 0;
            return s;
        }
    }
    public static void startSchedule(MyQueue myQueue, int q, Task[] tasks){
        int countTime = 0;
        while (!myQueue.isEmpty()) {
            Task task = myQueue.dequeue();
            int value = task.t;
            if (!(value - q <= 0)){
                myQueue.enqueue(task);
                task.t = value - q;
                countTime += q;
                continue;
            }
            else {
                System.out.printf("%s %d\n",task.name, countTime + value);
                countTime += value;
            }

        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,q;
        MyQueue myQueue = new MyQueue();
        n = scanner.nextInt();
        Task[] tasks = new Task[n];
        q = scanner.nextInt();
        for (int i = 0; i < n; i++){
            tasks[i] = new Task();
            tasks[i].name = scanner.next();
            tasks[i].t = scanner.nextInt();
            myQueue.enqueue(tasks[i]);
        }
        startSchedule(myQueue, q, tasks);
    }
}

