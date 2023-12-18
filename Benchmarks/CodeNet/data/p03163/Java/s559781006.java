

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{

    static long[][] maxknap;
    static ArrayList<Integer> values;
    static ArrayList<Integer> weights;
    static int N;
    static int reqd_weight;

    static void table(){
        for(int i=1;i<=N;i++){

            for(int j=1;j<=reqd_weight;j++){

                int t = 0;

                if(i%2==1){
                    t = 1;

                    if(weights.get(i-1)>j){
                        maxknap[t][j] = maxknap[t-1][j];
                    }
                    else{
                        maxknap[t][j] = max(maxknap[t-1][j],values.get(i-1)+maxknap[t-1][j-weights.get(i-1)]);
                    }

                }
                else{
                    t = 0;

                    if(weights.get(i-1)>j){
                        maxknap[t][j] = maxknap[t+1][j];
                    }
                    else{
                        maxknap[t][j] = max(maxknap[t+1][j],values.get(i-1)+maxknap[t+1][j-weights.get(i-1)]);
                    }

                }


            }

        }
    }

    static long max(long a, long b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) throws IOException {



        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = inp.readLine().split(" ");

        N = Integer.parseInt(nk[0]);
        reqd_weight = Integer.parseInt(nk[1]);

        weights = new ArrayList();
        values = new ArrayList<>();

        maxknap = new long[2][reqd_weight+1];


        for(int i=0;i<N;i++){
            String[] wv = inp.readLine().split(" ");

            int index = Collections.binarySearch(weights,Integer.parseInt(wv[0]));
            if(index>=0){
                weights.add(index,Integer.parseInt(wv[0]));
                values.add(index,Integer.parseInt(wv[1]));
            }
            else{
                index = -index - 1;
                weights.add(index,Integer.parseInt(wv[0]));
                values.add(index,Integer.parseInt(wv[1]));
            }
        }

        table();

//        System.out.println(weights);
//        System.out.println(values);



        System.out.println(max(maxknap[0][reqd_weight],maxknap[1][reqd_weight]));

    }
}
