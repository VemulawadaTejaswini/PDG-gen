import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static ArrayList[] al;
    public static int[] pos;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        al = new ArrayList[n];
        pos = new int[n];

        for(int i=0; i<n; i++){
            al[i] = new ArrayList<Integer[]>();
            pos[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<m; i++){
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int d = sc.nextInt();
            al[l].add(new int[]{r, d});
            al[r].add(new int[]{l, -d});
        }
        sc.close();

        boolean ret = true;

        for(int i=0; i<n; i++){
            if(al[i].size() != 0){
                if(pos[i] == Integer.MAX_VALUE) pos[i] = 0;
                ret = bfs(i, 0);
            }
            if(!ret) break;
        }

        if(ret){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean bfs(int i, int p){
        if(al[i].size() == 0) return true;
        for(int j=0; j<al[i].size(); j++){
            int[] tmp = (int[])(al[i].remove(0));
            if(pos[tmp[0]] == Integer.MAX_VALUE){
                pos[tmp[0]] = p + tmp[1];
            }else if(pos[tmp[0]] != p + tmp[1]){
                return false;
            }
            if(!bfs(tmp[0], p + tmp[1])) return false;
        }
        return true;
    }
}