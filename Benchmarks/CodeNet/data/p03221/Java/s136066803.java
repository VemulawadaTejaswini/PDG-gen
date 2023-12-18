import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import javax.print.attribute.standard.SheetCollate;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            //入力
            int N = scan.nextInt();
            int M = scan.nextInt();
            int[] P_ = new int[M];
            int[] Y_ = new int[M];
            Map<Integer, ArrayList> sheet = new TreeMap<Integer, ArrayList>();
            for(int i = 0; i < M; i++){
                P_[i] = scan.nextInt();
                Y_[i] = scan.nextInt();
                sheet.put(Y_[i], new ArrayList<Integer>(Arrays.asList(P_[i], i)));
            }

            String[] ans = new String[M];
            int[] pre = new int[N+1];
            for(ArrayList<Integer> list : sheet.values()){
                ans[list.get(1)] = String.format("%06d%06d", list.get(0), ++pre[list.get(0)]);
            }

            for(int i = 0; i < M; i++){
                System.out.println(ans[i]);
            }

        }finally{
            scan.close();
        }
    }
}
