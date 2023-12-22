import java.util.*;

public class Main{

    int n;
    int[][] ab;

    void solve(){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        ab = new int[n][2];
        for(int i=0; i<n; i++){
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }

        Arrays.sort(ab, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[1] - b[1];
                }
            });

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        int sum = 0;
        for(int i=0; i<n; i++){
            q.add(-ab[i][0]);
            sum += ab[i][0];
            if(sum>ab[i][1]) sum += q.poll();
        }

        System.out.println(q.size());
    }

    public static void main(String[] args){
        new Main().solve();
    }
}