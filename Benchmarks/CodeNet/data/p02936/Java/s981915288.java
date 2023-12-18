import java.util.*;

public class Main {
    static int max = 1000000;
    static int[] queue = new int[max];
    static int tail = 0; static int head = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        HashMap<Integer,HashSet<Integer>> graph = new HashMap<>();
        for (int i=1;i<=n;i++)graph.put(i,new HashSet<>());         //O(n)
        for (int i=0;i<n-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }                                                           //O(n)
        int[] data = new int[n+1];
        for (int i=0;i<q;i++)data[sc.nextInt()]+=sc.nextInt();      //O(n)
        enqueue(1);
        boolean[] seen = new boolean[n+1];
        for (int i=1;i<=n;i++)seen[i]=false;                        //O(n)
        seen[1]=true;
        while (!isEmpty()){
            int v = dequeue();
            for (int i : graph.get(v)){
                if (!seen[i]){
                    seen[i]=true;
                    enqueue(i);
                    data[i]+=data[v];
                }
            }
        }                                                           //O(n)
        for (int i=1;i<=n;i++)System.out.print(data[i]+" ");        //O(n)
        System.out.println();
    }
    static void init(){head = 0; tail = 0;}
    static boolean isEmpty(){return (head==tail);}
    static boolean isFull(){return (head == (tail+1)%max);}
    static public void enqueue(int v){
        if (isFull()){
            System.out.println("error: queue is full.");
            return;
        }
        queue[tail++] = v;
        if (tail == max) tail = 0;
    }
    static public int dequeue(){
        if (isEmpty()){
            System.out.println("error: queue is empty");
            return -1;
        }
        int res = queue[head];
        ++head;
        if (head == max) head = 0;
        return res;
    }
}
