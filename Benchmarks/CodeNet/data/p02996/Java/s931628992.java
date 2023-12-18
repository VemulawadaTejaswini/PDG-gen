import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int a, b;
        List<Task> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            list.add(new Task(a, b));
        }
        
        list.sort((o1, o2) -> o1.limit - o2.limit);
        long time = 0;
        for(int i = 0; i < n; i++){
            time += list.get(i).time;
            if(time > list.get(i).limit){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

class Task {
    int time;
    int limit;
    
    Task(int time, int limit){
        this.time = time;
        this.limit = limit;
    }
}