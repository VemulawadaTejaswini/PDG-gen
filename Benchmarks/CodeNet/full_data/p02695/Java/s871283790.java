import java.util.*;
import java.io.*;

class Main{
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[Q][4];

        for (int i=0; i<Q; i++) {
            st  = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken())-1;
            arr[i][1] = Integer.parseInt(st.nextToken())-1;
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
        }
        max = 0;
        dfs(N,M,Q,arr,1, new ArrayList());
        System.out.println(max);
    }

    public static void dfs(int N, int M, int Q, int[][] arr, int cur, ArrayList<Integer> curlist) {

        if (curlist.size()==N) {
            int score = 0;
            for (int i=0; i<Q; i++) {
                if (curlist.get(arr[i][1])-curlist.get(arr[i][0])==arr[i][2]) {
                    score+=arr[i][3];
                }
            }
            max = Math.max(max, score);
            return;
        }

        for (int i=cur; i<=M; i++) {
            curlist.add(i);
            dfs(N, M, Q, arr, i, curlist);
            curlist.remove(curlist.size()-1);
        }
    }

}