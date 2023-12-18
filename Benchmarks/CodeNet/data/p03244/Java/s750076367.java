import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();      
        int n = r.i();
        int[] v = r.ii();
        HashMap<Integer, Integer>[] hm = new HashMap[2];
        hm[0] = new HashMap<>();
        hm[1] = new HashMap<>();

        int[][] nums = new int[2][2];
        nums[0][0] = 1;
        nums[1][0] = 1;
        int[] keys = new int[2];
        int even = 0;
        for(int i = 0; i < n; i ++){
            int key = v[i];
            try{                
                int value = hm[even].get(key) + 1;
                int[] num = nums[even];
                hm[even].put(key, value);
                if(num[0] < value){
                    num[0] = value;
                    keys[even] = key;
                }
                else if(num[1] < value) num[1] = value;
            } catch(NullPointerException e){
                hm[even].put(key, 1);
            }     
            even = 1 - even;
        }
        int ans = n - nums[0][0];

        if(keys[0] != keys[1]){
            ans -= nums[1][0];
        } else{
            ans -= Math.max(nums[0][1], nums[1][1]);
        }
        print(ans);

    }
    static void print(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }

        String s() throws IOException{
            return readLine();
        }

        String[] ss() throws IOException{
            return s().split(" ");
        }

        int Int(String s){
            return Integer.parseInt(s);
        }

        int i() throws IOException{
            return Int(s());
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
    }
}