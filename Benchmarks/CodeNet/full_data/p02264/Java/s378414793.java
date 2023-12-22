import java.util.Scanner;

public class Main {
    
    static Pair[] queue;
    static int head;
    static int tail;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        
        queue = new Pair[100010];
        initialize();
        for(int i = 0; i < n; i++){
            enqueue(new Pair(sc.next(), Integer.parseInt(sc.next())));
        }
        
        int t = 0;
        StringBuilder sb = new StringBuilder();
        while(!isEmpty()){
            Pair x = dequeue();
            if(x.time <= q){
                t += x.time;
                sb.append(x.name).append(" ").append(t).append(System.lineSeparator());
            }else{
                t += q;
                x.time -= q;
                enqueue(x);
            }
        }
        
        System.out.print(sb);
    }
    
    static void initialize(){
        head = tail = 0;
    }
    
    static boolean isEmpty(){
        return head == tail;
    }
    
    static void enqueue(Pair x){
        
        queue[tail] = x;
        if(tail+1 == queue.length){
            tail = 0;
        }else{
            tail++;
        }
    }
    
    static Pair dequeue(){
        
        Pair x = queue[head];
        if(head+1 == queue.length){
            head = 0;
        }else{
            head++;
        }
        return x;
    }
    
    static class Pair{
        String name;
        int time;

        public Pair(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }
}
