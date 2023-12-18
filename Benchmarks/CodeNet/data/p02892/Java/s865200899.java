import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[][] c = new char[n][n];

        for (int i=0; i<n; i++){
            c[i] = sc.next().toCharArray();
        }


        int ans = 1;
        for (int i=0; i<n; i++){
            int[] dep = new int[n];
            Arrays.fill(dep, -1);
            Queue<Integer> q = new ArrayDeque<>();
            q.add(i);
            dep[i] = 1;
            while (!q.isEmpty()){
                int cur = q.poll();
                for (int j=0; j<n; j++){
                    if (c[cur][j]=='1'){
                        if (dep[j]==-1){
                            dep[j] = dep[cur]+1;
                            ans = Math.max(ans, dep[j]);
                            q.add(j);
                        }
                        if (dep[j]!=dep[cur]+1 && dep[j]!=dep[cur]-1){
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}