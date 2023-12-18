package codes;

import fastio.InputReader;
import fastio.OutputWriter;

public class CPrison {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.ni() , m = in.ni();
        int[] arr = new int[100003];

        for(int i = 0;i < m;++i){

            int l = in.ni() , r = in.ni();
            arr[l] = r;

        }
        int[][] gates = new int[m][2];
        int k = 0;
        for(int i = 0;i < arr.length ;++i){
            if(arr[i] != 0){
                gates[k][0] = i;
                gates[k++][1] = arr[i];
            }
        }

        int a = gates[0][0] , b = gates[0][1];
        int val = Integer.MAX_VALUE , ans = val;
        for(int i = 1;i < m;++i){
            int c = gates[i][0] , d = gates[i][1];
            if(c > b) ans = 0;
            else{
                if(d >= b) ans = (b-c+1);
                else ans = (d-c+1);
            }
            val = Math.min(val , ans);
        }

        out.println(val);

    }
}
