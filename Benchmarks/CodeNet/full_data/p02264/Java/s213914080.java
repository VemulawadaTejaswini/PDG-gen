
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        Deque<Task> deque=new ArrayDeque<>();
        long time=0;
        int n=scanner.nextInt();
        final int limit=scanner.nextInt();
        for(int i=0;i<n;i++){
            deque.addLast(new Task(scanner.next(),scanner.nextInt()));
        }
        while(deque.size()>0){
            Task currentTask=deque.removeFirst();
            if(currentTask.time<=limit){
                time+=currentTask.time;
                System.out.println(String.format("%s %d",currentTask.name,time));
            }else{
                currentTask.time=currentTask.time-limit;
                deque.addLast(currentTask);
                time+=limit;
            }
        }
    }
    public static class Task{
        public String name;
        public int time;
        public Task(String name,int time){
            this.name=name;
            this.time=time;
        }
    }
}

