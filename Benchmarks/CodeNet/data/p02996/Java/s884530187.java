import java.util.*;

public class Main{
    static final int INF = (int)1e9;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Work[] x = new Work[n];
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            x[i] = new Work(a,b);
        }
        
        Arrays.sort(x);
        
        boolean ans = true;
        long time = 0;
        for(Work w : x){
            time += w.a;
            if(time > w.b){
                ans = false;
                break;
            }
        }
        
        System.out.println(ans? "Yes" : "No");
    }
}

class Work implements Comparable<Work>{
    int a;
    int b;
    public Work(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int compareTo(Work o) {
        return this.b - o.b;
    }
}