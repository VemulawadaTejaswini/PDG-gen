import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void debug(String str){
        boolean debug = false;
        if(debug != true){
            return;
        }
        System.out.println(str);
    }
    public static void scanArray(Scanner sc ,int[] array, int num){
        for(int i =0;i<num;i++){
            array[i] = sc.nextInt();
        }
    }
    //最小公倍数
    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (long)(c/b);
    }

    public static void main(String[] args) {

        int N;
        Task[] TaskList;
        PriorityQueue<Task> queue = new PriorityQueue(1,new TaskComparator());

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            TaskList = new Task[N];

            for(int i =0;i<N;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                TaskList[i] = new Task(a, b);
            }
        }
        for(Task t :TaskList){
            queue.add(t);
        }
        Task t = null;
        //現在時間
        int time = 0;
        //余裕時間
        int remain = 0;
        while((t = queue.poll()) != null){
            if(time != t.b){
                //締め切りまで時間を進める
                time = t.b;
                //空き時間も進める
                remain += t.b;
            }
            //現在の余裕時間でタスクができるなら減らす
            if(t.a <= remain){
                remain -= t.a;
            }else{
                debug(t.a +":"+ t.b);
                //余裕時間を超えたタスクの場合
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    static class Task{
        int a;
        int b;

        public Task(int a,int b){
            this.a = a;
            this.b = b;
        }
    }

    static class TaskComparator  implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Task x = (Task)o1;
            Task y = (Task)o2;
            if (x.b > y.b) {
                return 1;
            } else if (x.b < y.b) {
                return -1;
            } else{
                return 0;
            }
        }
    }
}
