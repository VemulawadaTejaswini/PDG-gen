import java.io.*;
import java.util.*;

public class Main {
//    static PrintWriter out = new PrintWriter(System.out);
//    static Scanner sc = new Scanner(System.in);
//    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] rec = new int[n][];
        ArrayList<int[]> list = new ArrayList<>();
        int total = 0;
        String s;
        for(int i=0;i<n;i++){
            s = sc.next();
            int left=0, mini = 0;
            for(char c:s.toCharArray()){
                if(c=='(') left++;
                else left--;
                mini = Math.min(mini,left);
            }
            total += left;
//            rec[i] = new int[]{left, mini};
            list.add(new int[]{left, mini});
        }
        if(total!=0){
            System.out.println("No"); System.exit(0);
        }
//        Arrays.sort(rec,(a,b)->(Integer.compare(Math.min(b[1],b[0]+a[1]),Math.min(a[1],a[0]+b[1]))));
        Collections.sort(list,(a,b)->(Integer.compare(Math.min(b[1],b[0]+a[1]),Math.min(a[1],a[0]+b[1]))));
        int left = 0;
        String ans;
        for(int[] e:list){
            if(left+e[1]<0){
                System.out.println("No"); System.exit(0);
            }
            left += e[0];
        }
        ans = left==0?"Yes":"No";
        System.out.println(ans);
    }
    /*
    String solve(){
        int n = sc.nextInt();
        int[][] rec = new int[n][];
        for(int i=0;i<n;i++){
            String s = sc.next();
            rec[i] = helper(s,i);
        }
        Arrays.sort(rec,new myC());
        int left = 0;
        for(int[] e:rec){
            if(left+e[1]<0) return "No";
            left += e[0];
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
    }*/
}

