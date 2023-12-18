import java.util.*;

class Main{
    static int n = 0;
    static int k = 0;
    static int m = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        int[][] map = new int[n][n];
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a-1][b-1] = 1;
            map[b-1][a-1] = 1;
        }
        for(int i=0;i<k;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a-1][b-1] = -1;
            map[b-1][a-1] = -1;
        }

        // dump(map);
        int[] p = new int[n];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(map[i][j]==0){
                    int tmp = search(map, i, j, new ArrayList<Integer>(){});
                    if(tmp==j){
                        p[i]++;
                        p[j]++;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(p[i] + " ");
        }

    }

    public static int search(int[][] map, int p, int target, List<Integer> prev) {
        if(p==target)return target;
        prev.add(p);
        for(int i=0;i<n;i++){
            if(prev.contains(i))continue;
            if(map[p][i]==1){
                int tmp = search(map, i, target, prev);
                if(tmp==target)return target;
            }
        }
        return -1;
    }

    public static void dump(int[][] map) {
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
