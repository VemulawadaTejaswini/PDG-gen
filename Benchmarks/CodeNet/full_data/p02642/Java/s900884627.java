import java.util.*;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var a = new int[n];
        var b = new boolean[1000001];
        var set1 = new HashSet<Integer>();
        var set2 = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            set1.add(a[i]);
            if(b[a[i]]){
                set2.add(a[i]);
            }else{
                b[a[i]] = true;
            }
        }
        for(int i : set2){
            b[i] = false;
        }
        
        for(int i : set1){
            int x = i+i;
            while(x <= 1000000){
                b[x] = false;
                x += i;
            }
        }
        int ans = 0;
        for(int i = 1; i <= 1000000; i++){
            if(b[i]) ans++;
        }
        System.out.println(ans);
    }
}