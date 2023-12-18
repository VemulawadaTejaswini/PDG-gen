import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] D = new int[n];
        for(int i=0;i<n;i++) D[i]=sc.nextInt();
        int ans = help(D);
        System.out.println(ans);

    }
    static int help(int[] D){
        Arrays.sort(D);
        if(D[0]==0) return 0;
        int[] rec = new int[13];
        for(int i=0;i<D.length;i++){
            int cur = D[i];
            rec[cur]++;
            if(rec[cur]>2) return 0;
        }
        if(rec[12]>1) return 0;
        ArrayList<Integer> done = new ArrayList<>(), undone = new ArrayList<>();
        for(int i=1;i<12;i++){
            if(rec[i]==0) continue;
            if(rec[i]==2){
                done.add(i);
                done.add(24-i);
            }
            else undone.add(i);
        }
        if(rec[12]==1) done.add(12);
        if(undone.size()==0) return minGap(done);
        int len = undone.size();
        int ans = 0;
        for(int state=0;state<(1<<len);state++){
            for(int i=0;i<len;i++){
                if((state&(1<<i))==0) done.add(undone.get(i));
                else done.add(24-undone.get(i));
            }
            ans = Math.max(ans,minGap(done));
            for(int i=0;i<len;i++) done.remove(done.size()-1);
        }
        return ans;
    }
    static int minGap(ArrayList<Integer> time){
        int ans = 50;
        for(int w:time) ans = Math.min(ans,Math.min(w,24-w));
        for(int i=0;i<time.size();i++){
            for(int j=i+1;j<time.size();j++){
                int cur = Math.abs(time.get(i)-time.get(j));
                ans = Math.min(ans,Math.min(cur,24-cur));
            }
        }
        return ans;
    }
}
