import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Point> li = new ArrayList<Point>();
        for(int i = 0; i < q; i++){
            li.add(new Point(sc.nextInt()-1,sc.nextInt()-1,sc.nextInt(),sc.nextInt()));
        }
        int[] arr = new int[n];
        arr[0] = 1;
        System.out.println(dfs(1,arr,li,n,m));
    }
    
    public static long dfs(int cnt, int[] arr, ArrayList<Point> li, int n, int max){
        long ret = 0;
        if(cnt == n){
            for(Point p : li){
                if(arr[p.b] - arr[p.a] == p.c){
                    ret += p.d;
                }
            }
            return ret;
        }
        for(int i = arr[cnt-1]; i <= max; i++){
            arr[cnt] = i;
            ret = Math.max(ret,dfs(cnt+1,arr,li,n,max));
        }
        return ret;
    }
}

class Point{
    int a,b,c,d;
    public Point(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
