import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.String.format;

public class Main{
    final static int MAX = 1000 + 5;
    static int n, m;
    static int[] a = new int[MAX];
    
    static void solve(){
        int[] task = new int[MAX];
        for(int i=0;i<n;i++) task[i] = m / a[i] * a[i];
        int min = 1<<29, idx=-1;
        for(int i=0;i<n;i++) {
            if(task[i] < min) { min = task[i]; idx = i; }
            else if(idx>=0){
                if(task[i] == min && a[i] < a[idx]) { idx = i; }
                else if(task[i] == min && a[i] == a[idx]) { idx = -2; }
            }
        }
        if(idx == -2) out.println(n);
        else out.println(idx+1);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n == 0 && m == 0) break;
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            solve();
        }
    }
}