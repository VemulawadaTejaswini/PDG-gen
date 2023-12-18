import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Sort[] s = new Sort[n];
        for(int i = 0; i < n; i++){
            s[i] = new Sort(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        Arrays.sort(s);
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int x = 0;
        int ans = 0;
        for(int i = 1; i <= m; i++){
            while(x < n && s[x].a <= i){
                queue.offer(s[x].b);
                x++;
            }
            if(!queue.isEmpty()){
                ans += queue.poll();
            }
        }
        
        System.out.println(ans);
    }
}

class Sort implements Comparable<Sort>{
    int a;
    int b;
    
    Sort(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Sort s) {
        
        if(this.a < s.a){
            return -1;
        }else if(this.a > s.a){
            return 1;
        }else{
            return 0;
        }
    }
}