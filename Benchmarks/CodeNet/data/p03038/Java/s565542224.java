import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            a.offer(Integer.parseInt(sc.next()));
        }
        
        List<BC> list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            list.add(new BC(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
        }
        Collections.sort(list);
        
        int count = 0;
        int b, c;
        for(int i = 0; i < m; i++){
            b = list.get(i).b;
            c = list.get(i).c;
            for(int j = 0; j < b; j++){
                if(a.peek() >= c){
                    break;
                }
                a.poll();
                a.offer(c);
                count++;
                if(count >= n){
                    break;
                }
            }
            if(c <= a.peek() || count >= n){
                break;
            }
        }
        
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += a.poll();
        }
        System.out.println(ans);
    }
}

class BC implements Comparable<BC>{
    int b;
    int c;
    
    BC(int b, int c){
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(BC bc) {
        
        if(this.c > bc.c){
            return -1;
        }else if(this.c < bc.c){
            return 1;
        }else{
            return 0;
        }
    }
}