import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] process = br.readLine().split(" ");
        int psNum = Integer.parseInt(process[0]);
        int time = Integer.parseInt(process[1]);
        Queue<String> que = new Queue<String>();
        Queue<String> result = new Queue<String>();
        int totaltime = 0;
        
        for(int i = 0; i<psNum ;i++)que.enqueue(br.readLine());
        
        while(!(que.isEmpty())){
            String[] line = que.dequeue().split(" ");
            if(Integer.parseInt(line[1]) <= time){
                totaltime = totaltime + Integer.parseInt(line[1]);
                result.enqueue(line[0] + " " + totaltime);
            } else {
                totaltime = totaltime + time;
                line[1] = Integer.toString(Integer.parseInt(line[1]) - time);
                que.enqueue(line[0] + " " + line[1]);
            }
        }
        while(!(result.isEmpty())){
            System.out.println(result.dequeue());
        }

    }
    static class Queue<T> {
        final int SIZE = 100000;
        private List<T> values = new LinkedList<T>();
        boolean enqueue(T data) {
            if (data == null) return false;
            if (values.size() == SIZE) {
                return false;
            }
            values.add(data);
            return true;
        }
        T dequeue() {
            T data = null;
            if (values.size() != 0) {
                data = values.remove(0);
            }
            return data;
        }
        boolean isEmpty() {
            return (values.size() == 0);
        }
        boolean isFull() {
            return (values.size() >= 100000);
        }
    }
};
