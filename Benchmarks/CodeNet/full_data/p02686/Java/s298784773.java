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
        TreeSet<Integer> bothEnd = new TreeSet<>(), front = new TreeSet<>(), end = new TreeSet<>();
        ArrayList<int[]> list = new ArrayList<>(); // leftMin<0&&rightMin<0
        int leftCnt = 0, rightCnt = 0;
        for(int i=0;i<n;i++) {
            arr[i]  =sc.next();
            int[] temp = helper(arr[i],i);
            leftCnt += temp[2]; rightCnt += temp[3];
            if(temp[0]==0&&temp[1]==0){
                bothEnd.add(i);
                continue;
            }
            if(temp[0]>=0) front.add(i);
            else if(temp[1]>=0) end.add(i);
            else list.add(temp);
        }
        if(leftCnt!=rightCnt) return "No";
        if(front.size()==0&&bothEnd.size()>0){
            int cur = bothEnd.first();
            front.add(cur); bothEnd.remove(cur);
        }
        end.addAll(bothEnd);
        Collections.sort(list,new myC());
        ArrayList<Integer> res = new ArrayList<>();
        for(int i:front) res.add(i);
        for(int[] cur:list) res.add(cur[4]);
        for(int i:end) res.add(i);
        int left = 0;
        for(int idx:res){
            char[] ss = arr[idx].toCharArray();
            for(char c:ss){
                if(c=='(') left++;
                else left--;
                if(left<0) return "No";
            }
        }
        return "Yes";
    }
    int[] helper(String s, int idx){
        // {left_min, right_min, left_total, right_total, idx}
        char[] arr = s.toCharArray();
        int leftTotal = 0, n = s.length();
        int left = 0, leftMin = 100;
        for(int i=0;i<n;i++){
            if(arr[i]=='(') {
                left++; leftTotal++;
            }
            else left--;
            leftMin = Math.min(leftMin,left);
        }
        int rightMin = 100, right = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==')') right++;
            else right--;
            rightMin = Math.min(rightMin, right);
        }
        return new int[]{leftMin, rightMin, leftTotal, n-leftTotal, idx};
    }
    class myC implements Comparator<int[]>{
        // handling the cases with leftMin<0 && rightMin<0
        public int compare(int[] a, int[] b){
            return a[0]-b[0];
        }
    }
}

