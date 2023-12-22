import java.util.*;
import java.util.Queue; 
import java.util.LinkedList;

class Main{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        Queue<String> n = new LinkedList<String>();
        Queue<Integer> t = new LinkedList<Integer>();
    
        int num = sc.nextInt();
        int cnt = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < num; i++){
            n.offer(sc.next());
            t.offer(sc.nextInt());
        }
        
        int time;
        String name;
        while((name = n.poll()) != null){
            time = t.poll();
            if(time <= 100){
                sum += time;
                System.out.println(name + " " + sum);
            }else{
                sum += 100;
                time = time - 100;
                n.offer(name);
                t.offer(time);
            }
        }
    }
}
