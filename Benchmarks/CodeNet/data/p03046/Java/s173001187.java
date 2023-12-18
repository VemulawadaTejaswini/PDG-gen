import java.io.*;
import java.util.*;


public class Main {
    static int n,count;
    static int[] id;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int M = sc.nextInt(), k = sc.nextInt();
        int n = 1<<M;
        List<Integer> res = help(n,k);
        if(res.size()==0) System.out.println(-1);
        else{
            for(int i:res) System.out.print(i+" ");
        }
    }
    static List<Integer> help(int n, int k){
        ArrayList<Integer> res = new ArrayList<>();
        // 0 - n-1;
        if(k==0){
            int[] ans = new int[n*2];
            for(int i=0;i<n;i++) {
                res.add(i);
                res.add(i);
            }
            return res;
        }
        if(k>n-1) return res;
        int sum = 0;
        for(int i=1;i<n;i++){
            if(i!=k) sum ^= i;
        }
        if(sum != k) return res;
        res.add(0);
        res.add(k);
        for(int i=1;i<n;i++){
            if(i!=k) res.add(i);
        }
        res.add(k);
        for(int i=n-1;i>=0;i--){
            if(i!=k) res.add(i);
        }
        return res;
    }
}

