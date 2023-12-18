import java.util.*;

public class Main {
    static int max = 1000000;
    static long[] queue = new long[max];
    static int tail = 0; static int head = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i=1;i<=9;i++)enqueue(i);
        for (int i=0;i<k-1;i++){
            long x = dequeue();
            if (x%10!=0)enqueue(10*x+(x%10)-1);
            enqueue(10*x+(x%10));
            if (x%10!=9)enqueue(10*x+(x%10)+1);
        }
        System.out.println(dequeue());
    }
    static void init(){head = 0; tail = 0;}
    static boolean isEmpty(){return (head==tail);}
    static boolean isFull(){return (head == (tail+1)%max);}
    static public void enqueue(long v){
        if (isFull()){
            System.out.println("error: queue is full.");
            return;
        }
        queue[tail++] = v;
        if (tail == max) tail = 0;
    }
    static public long dequeue(){
        if (isEmpty()){
            System.out.println("error: queue is empty");
            return -1;
        }
        long res = queue[head];
        ++head;
        if (head == max) head = 0;
        return res;
    }
}
