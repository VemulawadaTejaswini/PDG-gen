

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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

                if(weights.get(i-1)>j){
                    maxknap[i][j] = maxknap[i-1][j];
                }
                else{
                    maxknap[i][j] = max(maxknap[i-1][j],values.get(i-1)+maxknap[i-1][j-weights.get(i-1)]);
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

        maxknap = new long[N+1][reqd_weight+1];


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

//        for(int i=0;i<=N;i++){
//            for(int j=0;j<=reqd_weight;j++){
//                System.out.print(maxknap[i][j]+ " ");
//            }
//            System.out.println("");
//        }

        System.out.println(maxknap[N][reqd_weight]);

    }
}
