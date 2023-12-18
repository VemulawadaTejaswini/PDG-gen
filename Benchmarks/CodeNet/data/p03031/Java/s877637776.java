import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

public class Main {

    // static final int modnum = 1e9 + 7;
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        ArrayList<ArrayList<Integer>> light = new ArrayList<ArrayList<Integer>>();

        for(int m=0;m<M;m++){
            int k = sc.nextInt();
            ArrayList<Integer> switches = new ArrayList<Integer>();
            light.add(switches);
            for(int s=0;s<k;s++){
                int swi = sc.nextInt();
                switches.add(swi);
            }
        }

        int[] P = new int[M];
        for(int i = 0;i<M;i++){
            P[i]=sc.nextInt();
        }

        System.out.println(checker(new int[N], P, light));
    }

    private static int checker(int[] list,int[] P,ArrayList<ArrayList<Integer>> light){

        int[] nex = list.clone();
        for(int i=0;i<nex.length;i++){
            if(nex[i]==0){
                int ret = 0;
                nex[i]=1;
                ret += checker(nex,P,light);
                nex[i]=-1;
                ret += checker(nex,P,light);
                return ret;
            }
        }
        int ret = 0;
        for(int i=0;i<M;i++){
            ArrayList<Integer> needs = light.get(i);
            int sum = 0;
            for(int l:needs){
                if(list[l-1]==1)
                    sum++;
            }
            if(sum%2 == P[i]){
                ret++;
            }
        }
        if(ret == M)
            ret = 1;
        else 
            ret = 0;
        // System.out.println(Arrays.toString(list)+"  "+ret);
        return ret;
    }
}