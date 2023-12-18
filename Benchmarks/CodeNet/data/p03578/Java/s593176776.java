import java.util.*;

public class Main{
    public static void run(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer,Integer> d = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            int di = sc.nextInt();
            if(d.containsKey(di)){
                d.put(di,d.get(di) + 1);
            }else{
                d.put(di, 1);
            }
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int t = sc.nextInt();
            if(d.containsKey(t)){
                d.put(t, d.get(t)- 1);
                if(d.get(t) <= 0){
                    d.remove(t);
                }
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args){
        run();
    }
}
