import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int M;
        Task[] tasks;
        PriorityQueue<Task> queue1 = new PriorityQueue<>(1,new TaskComparator1());
        PriorityQueue<Task> queue2 = new PriorityQueue<>(1,new TaskComparator2());

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();
            tasks = new Task[N];
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                tasks[i] = new Task(a, b);
            }
        }
        for(Task t :tasks){
            queue1.add(t);
        }

        Task[] daySortTask = new  Task[N];
        for (int i = 0; i < N; i++) {
            daySortTask[i] = queue1.poll();
        }
        long result = 0;
        //日付を増やしていく
        int c = 0;
        //最後の日から逆算していく
        for(int d = 1; d <= M;d++){
            //dまでいれて
            while(true){
                if(!(c < N)){
                    break;
                }
                Task t = daySortTask[c];
                if(t.a <= d){
                    queue2.add(t);
                }else{
                    break;
                }
                c++;
            }
            //先頭(一番稼げるやつ)をとりだす
            Task t = queue2.poll();
            if( t !=null){
                result += t.b;
            }
        }

        System.out.println(result);
        return;
    }

    static class Task{
        int a;
        int b;

        public Task(int a,int b){
            this.a = a;
            this.b = b;
        }
    }
    static class TaskComparator1  implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Task x = (Task)o1;
            Task y = (Task)o2;
            if (x.a > y.a) {
                return 1;
            } else if (x.a < y.a) {
                return -1;
            } else{
                return 0;
            }
        }
    }
    static class TaskComparator2  implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Task x = (Task)o1;
            Task y = (Task)o2;
            if (x.b > y.b) {
                return -1;
            } else if (x.b < y.b) {
                return 1;
            } else{
                return 0;
            }
        }
    }
}
