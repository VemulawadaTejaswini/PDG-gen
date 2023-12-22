import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static class Task {
        String name;
        Integer time;

        public Task(String name, Integer time) {
            this.name = name;
            this.time = time;
        }

        public Task() {
        }

        @Override
        public String toString() {
            return this.name+" "+this.time;
        }
    }

    static Queue<Task> queue = new LinkedList<Task>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] p1 = sc.nextLine().trim().split(" ");
        int n = Integer.parseInt(p1[0]);
        int p = Integer.parseInt(p1[1]);
        for (int i = 0; i < n; i++) {
            String[] split = sc.nextLine().trim().split(" ");
            queue.add(new Task(split[0], Integer.parseInt(split[1])));
        }
        int sum=0;
        while (!queue.isEmpty()){
            Task poll = queue.poll();
            if(poll.time<=p){
                sum+=poll.time;
                poll.time=sum;
                System.out.println(poll);
            }else{
                poll.time-=p;
                sum+=p;
                queue.add(poll);
            }
        }
    }
}
