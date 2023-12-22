import java.util.*;

public class Main {
    static int head = 0;
    static int tail = 0;
    static final int MAX = 100000;
    static int[] Q = new int[MAX];
    static int NOW = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        LinkedList<String> name = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            name.offer(sc.next());
            enqueue(sc.nextInt());
        }

        ArrayList<String> ansName = new ArrayList<>();
        ArrayList<Integer> ansTime = new ArrayList<>();
        String tmpName;
        int tmpTime;

        while(!isEmpty()){
            tmpName = name.poll();
            tmpTime = dequeue();
            if(tmpTime <= q){
                NOW += tmpTime;
                ansName.add(tmpName);
                ansTime.add(NOW);
            }else{
                NOW += q;
                name.offer(tmpName);
                tmpTime -= q;
                enqueue(tmpTime);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ansName.get(i) + " " + ansTime.get(i));
        }
    }

    static Boolean isEmpty(){
        return head == tail;
    }

    static void enqueue(int x){
        Q[tail] = x;
        if(tail + 1 == MAX){
            tail = 0;
        }else{
            tail ++;
        }
    }

    static int dequeue(){
        int x = Q[head];
        if(head + 1 == MAX){
            head = 0;
        }else {
            head++;
        }
        return x;
    }
}

