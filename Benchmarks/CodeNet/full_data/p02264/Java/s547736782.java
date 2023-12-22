import java.util.Scanner;

public class Main {

    static class P{
        String name;
        int time;
    }

    static int len = 100001;
    static P[] Q = new P[len];

    static int head = 0;
    static int tail = 0;

    static boolean isEmpty(){
        return head == tail;
    }

    static boolean isFull(){
        return head == (tail + 1) % len;
    }

    static void enqueue(P p){
        if(isFull()){
            throw new IndexOutOfBoundsException();
        }
        Q[tail] = p;

        tail = (tail + 1) % len;
    }

    static P dequeue(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        P temp = Q[head];

        head = (head + 1) % len;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P p = null;
        int n = 0;
        int q = 0;
        int index = 0;
        String[] temp = null;
        while (sc.hasNextLine()){
            if(n == 0){
                temp = sc.nextLine().split(" ");
                n = Integer.valueOf(temp[0]);
                q = Integer.valueOf(temp[1]);
            }else{
                temp = sc.nextLine().split(" ");
                p = new P();
                p.name = temp[0];
                p.time = Integer.valueOf(temp[1]);
                enqueue(p);
                index ++;
                if(index == n){
                    break;
                }
            }
        }

        int sumTime = 0;//当前总运行时间

        P curr = null;
        while (head != tail){
            curr = dequeue();
            int c = min(q,curr.time);
            curr.time -= c;
            sumTime += c;
            if(curr.time > 0){
                //如果当前任务有剩余时间 则加入队列
                enqueue(curr);
            }else{
                System.out.println(curr.name + " " + sumTime);
            }
        }
    }


    static int min(int a,int b){
        return a > b ? b : a;
    }
}

