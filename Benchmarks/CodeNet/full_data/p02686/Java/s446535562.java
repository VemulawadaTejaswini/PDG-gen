import java.io.*;
import java.util.*;

public class Main {
//    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
//    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        Main main = new Main();
        String ans = main.solve();
        System.out.println(ans);
    }

    String solve(){
        int n = sc.nextInt();
        Pair[] list = new Pair[n];
        for(int i=0;i<n;i++){
            String s = sc.next();
            int[] temp = helper(s,i);
            list[i] = new Pair(temp[0], temp[1]);
        }
        Arrays.sort(list);
        int left = 0;
        for(Pair e:list){
            if(left+e.mini<0) return "No";
            left += e.left;
        }
        return left==0?"Yes":"No";
    }
    int[] helper(String s, int idx){
        int left = 0, mini = 100;
        for(char c:s.toCharArray()){
            if(c=='(') left++;
            else left--;
            mini = Math.min(mini,left);
        }
        return new int[]{left, mini, idx};
    }
    class Pair implements Comparable<Pair>{
        int left,mini;
        public Pair(int le, int mi){
            left = le; mini = mi;
        }
        public int compareTo(Pair p){
//            int res1 = Math.min(this.mini, this.left+p.mini);
            int res1 = this.mini<this.left+p.mini?this.mini:this.left+p.mini;
//            int res2 = Math.min(p.mini, this.mini+p.left);
            int res2 = p.mini < this.mini+p.left? p.mini:this.mini+p.left;
            if(res1 == res2) return 0;
            return res1 < res2? 1:-1;
        }
    }
}

