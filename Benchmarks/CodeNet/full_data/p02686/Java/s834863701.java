import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    long[] fac, inv;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        String ans = main.solve();
        System.out.println(ans);
    }
    String solve(){
        int n = sc.nextInt();
        String[] arr = new String[n];
        int[][] rec = new int[n][];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
            rec[i] = helper(arr[i],i);
        }
        Arrays.sort(rec,new myC());
        int left = 0;
        for(int[] e:rec){
            String s = arr[e[2]];
            for(char c:s.toCharArray()){
                if(c=='(') left++;
                else left--;
                if(left<0) return "No";
            }
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
    class myC implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            int res1 = Math.min(a[1], a[0]+b[1]);
            int res2 = Math.min(b[1],b[0]+a[1]);
            return Integer.compare(res2, res1); // the bigger, the fronter
        }
    }

}

