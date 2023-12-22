
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by sd on 2016/11/22.
 */
public class Main {
    static class Pair{
        String name;
        int left;
        Pair(String name, int left){
            this.name = name;
            this.left = left;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Pair> queue = new LinkedList<>();
        int n = sc.nextInt(), q = sc.nextInt();
        int time_w = 0;
        for(int i=0; i<n; i++){
            String str = sc.next();
            int time = sc.nextInt();

            if(time > q){
                time_w += q;
                queue.add(new Pair(str, time-q));
            }else{
                time_w += time;
                System.out.println(str+" "+time_w);
            }
        }
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            String str = p.name;
            int time = p.left;
            if(time > q){
                time_w += q;
                queue.add(new Pair(str, time-q));
            }else{
                time_w += time;
                System.out.println(str+" "+time_w);
            }
        }

    }
}