import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        PriorityQueue<Task> queue = new PriorityQueue<>();
        
        for(int i = 0; i < N; i++){
            int requireTime = sc.nextInt();
            int deadLine = sc.nextInt();
            queue.add(new Task(requireTime, deadLine));
        }
        
        boolean isOK = true;
        int elapsedTime = 0;
        
        while(!queue.isEmpty()){
            Task task = queue.poll();
            
            if( elapsedTime <= task.deadLine - task.requireTime ){
                elapsedTime += task.requireTime;
            } else {
                isOK = false;
                break;
            }
        }
        
        System.out.println( isOK ? "Yes" : "No" );
        
    }
    
    static class Task implements Comparable<Task> {
        int requireTime;
        int deadLine;
        
        public Task(int requireTime, int deadLine){
            this.requireTime = requireTime;
            this.deadLine = deadLine;
        }
        
        public int compareTo(Task other){
            return this.deadLine - other.deadLine;
        }
    }
}
