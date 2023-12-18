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
        out.println(ans);
        out.flush();
    }
    String solve(){
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++) arr[i]  =sc.next();
        int[][] rec = new int[n][4]; // {left_max, left_total, right_total}
        int leftTotal = 0, rightTotoal = 0;
        for(int i=0;i<n;i++){
            rec[i] = helper(arr[i],i);
            leftTotal += rec[i][1]; rightTotoal += rec[i][2];

        }
        if(leftTotal!=rightTotoal) return "No";
        Arrays.sort(rec,Comparator.comparingInt(e1->(-e1[0])));
        int left = 0;
        for(int i=0;i<n;i++){
            String s = arr[rec[i][3]];
            for(char c:s.toCharArray()){
                if(c=='(') left++;
                else left--;
                if(left<0) return "No";
            }
        }
        return "Yes";
    }
    int[] helper(String s, int idx){
        int leftTotal = 0;
        char[] arr = s.toCharArray();
        int left = arr[0]=='('?1:-1;
        if(arr[0]=='(') leftTotal = 1;
        int leftMax = left;
        for(int i=1;i<arr.length;i++){
            if(arr[i]=='(') {
                leftTotal++;
                left++;
            } else{
                left--;
            }
            leftMax = Math.max(leftMax,left);
        }
        return new int[]{leftMax, leftTotal, arr.length-leftTotal, idx};

    }
}

