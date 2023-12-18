import java.util.*;

class Task implements Comparable<Task>{
    int a;
    int b;

    @Override
    public int compareTo(Task o){
        return this.b - o.b;
    }

    public Task(int a, int b){
        this.a = a;
        this.b = b;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Task> q = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            q.add(new Task(sc.nextInt(), sc.nextInt()));
        }

        int t = 0;

        while(!q.isEmpty()){
            Task task = q.poll();
            if(t + task.a > task.b){
                System.out.println("No");
                return;
            }
            t += task.a;
        }

        System.out.println("Yes");

    }
}
