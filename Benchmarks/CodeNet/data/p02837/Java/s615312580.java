import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Map<Integer, Integer>> al = new ArrayList<Map<Integer,Integer>>();
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            HashMap<Integer,Integer> tmpl = new HashMap<Integer, Integer>();
            for(int j = 0; j < A; j++){
                int xn = sc.nextInt();
                int yn = sc.nextInt();
                tmpl.put(xn,yn);
            }
            al.add(tmpl);
        }
        int ans = 0;
        int max_q = (int)Math.pow(2,N);
        for(int i = 0; i < max_q; i++){
            boolean bool = true;
            int cnt = 0;
            for(int j = 0; j < N; j++){
                if((i >> j) % 2 == 0){
                    continue;
                }
                cnt++;
                for(Map.Entry<Integer, Integer> entry : al.get(j).entrySet()){
                    int key = entry.getKey()-1;
                    int val = entry.getValue();
                    if((i >> key) % 2 != val){
                        bool = false;
                    }
                }
            }
            if(bool){
                ans = Math.max(ans,cnt);
            }
        }
        System.out.println(ans);
    }
}

