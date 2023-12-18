import java.util.*;
class Main {
    static int n ;
    static int m ;
    static int q;
    static int ans = 0;
    static int[] a,b,c,d;
    static List<Integer> A = new ArrayList<>();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        q = scan.nextInt();
        a = new int[q];
        b = new int[q];
        c = new int[q];
        d = new int[q];
        for(int i = 0;i<q;i++){
            a[i]=scan.nextInt();
            b[i]=scan.nextInt();
            c[i]=scan.nextInt();
            d[i]=scan.nextInt();
        }
        A.add(1);
        dfs(A);
        System.out.println(ans);
}
static void dfs(List<Integer> A) {
    if(A.size() == n) {
        int temp = 0;
        for(int i = 0; i < q; i++) {
            if(A.get(b[i]-1)-A.get(a[i]-1) == c[i])
                temp += d[i];
        }
        ans = Math.max(ans, temp);
        return;
    }
    int x = A.get(A.size()-1);
    for(int i = x; i <= m; i++){
        A.add(i);
        dfs(A);
        A.remove(A.size()-1);
    }
}
}