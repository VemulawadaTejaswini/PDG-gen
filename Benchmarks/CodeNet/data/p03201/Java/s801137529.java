import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int n;
    static int[] A;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n];
        for(int i=0;i<n;i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] dic = new int[30];
        dic[0] = 2;
        for(int i=1;i<30;i++) dic[i] = dic[i-1]*2;
        for(int w:A){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        HashSet<Integer> used = new HashSet<>();
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            if(!used.add(A[i])) continue;
            int idx = Arrays.binarySearch(dic,A[i]);
            if(idx==0){
                int cur = map.get(A[i]);
                ans += cur/2;
            } else{
                idx= -(idx+1);
                int target = dic[idx];
                if(!map.containsKey(target-A[i])) continue;
                int cur = Math.min(map.get(target-A[i]),map.get(A[i]));
                ans += cur;
                map.put(target-A[i],map.get(target-A[i])-cur);
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
    }
}
