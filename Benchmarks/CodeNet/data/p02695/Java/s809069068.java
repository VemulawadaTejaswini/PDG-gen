import java.util.*;
class Main{
    static int max;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();
        int[][] a = new int[q][4];
        max = 0;
        for(int i = 0; i < q; i++){
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
            a[i][2] = scanner.nextInt();
            a[i][3] = scanner.nextInt();
        }
        dfs(0, new ArrayList<Integer>(), n,m,q,a);
        System.out.println(max);
    }

    public static void dfs(int idx, List<Integer> A, int n, int m, int q, int[][] a){
        if(idx == n){
            if(A.size() < n)return;
            int score = 0;
            for(int i = 0; i < q; i++){
                if(A.get(a[i][1]-1) - A.get(a[i][0]-1) == a[i][2]){
                    score += a[i][3];
                }
            }
            if(max < score){max = score;}
            return;
        }else{
            int val = 1;
            if(idx-1 >= 0){
                val = A.get(idx-1);
            }
            for(int i = val; i <= m; ++i){
                A.add(i);
                dfs(idx+1, A, n, m, q, a);
                A.remove(A.size()-1);
            }
        }
    }
}

