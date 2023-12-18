import java.util.*;
import java.io.*;

class Task implements Comparable<Task>{
    int amount;
    int deadline;
    public Task(int a, int d){
        this.amount=a;
        this.deadline=d;
    }
    public int compareTo(Task another){
        return this.deadline-another.deadline;
    }
    public String toString(){
        return "["+amount+" "+deadline+"]";
    }
}
public class Main {
    static void possible(){
        System.out.println("Yes");
        System.exit(0);
    }
    static void impossible(){
        System.out.println("No");
        System.exit(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Task[] task = new Task[N];
        for(int n=0; n<N; n++){
            task[n] = new Task(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(task);

        long curTime = 0;
        for(int n=0; n<N; n++){
            curTime += task[n].amount;
            if(curTime>task[n].deadline) impossible();
        }
        possible();
    }
}