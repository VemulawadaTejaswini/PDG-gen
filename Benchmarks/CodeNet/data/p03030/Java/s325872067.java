import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] S = new String[N];
        int[] P = new int[N];
        String[] sp = new String[N];
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<N; i++){
            S[i] = sc.next();
            P[i] = sc.nextInt();
            sp[i] = S[i] + "_" + (100 - P[i]) + "_" + (i + 1);
            list.add(sp[i]);
        }

        Collections.sort(list);
        System.out.println(list);
        for(int i=0; i<N; i++){
            String ans = list.get(i).split("_")[2];
            System.out.println(ans);
        }
    }
}