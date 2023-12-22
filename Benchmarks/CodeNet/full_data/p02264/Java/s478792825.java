import java.util.Scanner;
import java.nio.*;

class Queue{
    private String name;
    private int time;

    public Queue(String name, int time){
        this.name = name;
        this.time = time;
    }

    public String getName(){
        return name;
    }

    public int getTime(){
        return time;
    }
}

class MyQueue{
    private Queue[] queue;
    private int head = 0;
    private int tail = 0;
    
    public MyQueue(int size){
        queue = new Queue[size + 1];
    }

    public boolean isEmpty(){
        return head == tail;
    }

    public boolean isFull(){
        return head == (tail + 1) % queue.length;
    }

    public void enqueue(String name, int time) throws Exception{
        if(isFull()){
            throw new Exception();
        }

        queue[tail] = new Queue(name, time);

        if(tail + 1 == queue.length){
            tail = 0;
        }else{
            tail++;
        }
    }

    public Queue dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception();
        }
        Queue x = queue[head];
        if(head + 1 == queue.length){
            head = 0;
        }else{
            head++;
        }
        return x;
    }

    public int min(int a, int b){
        return a < b ? a : b;
    }
}

public class Main{
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        MyQueue queue = new MyQueue(n);

        String name;
        int time;
        for(int i = 0; i < n; i++){
            name = sc.next();
            time = sc.nextInt();
            queue.enqueue(name, time);
        }
        
        int sum = 0;
        while(!queue.isEmpty()){
            Queue q1 = queue.dequeue();
            if(q1.getTime() > q){
                sum += q;
                queue.enqueue(q1.getName(), q1.getTime() - q);
            }else{
                sum += q1.getTime();
                System.out.println(q1.getName() + " " + sum);
            }
        }
    }
}


