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
        TreeSet<int[]> bothEnd = new TreeSet<>(new netLeft()), front = new TreeSet<>( new netLeft()), end = new TreeSet<>(new netLeft());
        ArrayList<int[]> list = new ArrayList<>(); // leftMin<0&&rightMin<0
        TreeSet<int[]> compareNetLeft = new TreeSet<>(new netLeft()); // bigger netLeft comes first
        int leftCnt = 0, rightCnt = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
            int[] temp = helper(arr[i],i);
            if(temp[0]==0&&temp[1]==0) bothEnd.add(temp);
            else if(temp[0]>=0) front.add(temp);
            else if(temp[1]>=0) end.add(temp);
            else list.add(temp);
            leftCnt += temp[2]; rightCnt += temp[3];
        }
        if(leftCnt!=rightCnt) return "No";
        if(front.size()==0&&bothEnd.size()>0){
            int[] temp = bothEnd.first();
            front.add(temp); bothEnd.remove(temp);
        }
        end.addAll(bothEnd);
        int[] endArray = end.pollLast();
        list.addAll(end);
        Collections.sort(list,new myC()); // reverse order of min_left
        ArrayList<int[]> res = new ArrayList<>();
        int left = 0,idx=0;
        for(int[] t:front){
            char[] ss = arr[t[4]].toCharArray();
            for(char c:ss){
                if(c=='(') left++;
                else left--;
            }
        }
        for(int i=0;i<list.size();i++){
            while(idx<list.size()&&list.get(idx)[0]+left>=0){
                compareNetLeft.add(list.get(idx));
                idx++;
            }
            if(compareNetLeft.isEmpty()) return "No";
            // then choose the one with the biggest net_left
            int[] cur = compareNetLeft.pollFirst();
            for(char c:arr[cur[4]].toCharArray()){
                if(c=='(') left++;
                else left--;
                if(left<0) return "No";
            }
        }
        for(char c:arr[endArray[4]].toCharArray()){
            if(c=='(') left++;
            else left--;
            if(left<0) return "No";
        }
        return left==0?"Yes":"No";
    }
    int[] helper(String s, int idx){
        // {left_min, right_min, left_total, right_total, idx, netLeft}
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
        return new int[]{leftMin, rightMin, leftTotal, n-leftTotal, idx, left};
    }
    class myC implements Comparator<int[]>{
        // handling the cases with leftMin<0 && rightMin<0
        public int compare(int[] a, int[] b){
            return b[0]-a[0];
        }
    }
    class netLeft implements Comparator<int[]>{
        public int compare(int[] a, int[] b){return b[5]-a[5];}
    }
}

