import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    static boolean[] isWork;
    static boolean[][] dp;
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int c = stdIn.nextInt();
        String s = stdIn.next();
        char[] cs = s.toCharArray();

        isWork = new boolean[n];
        for(int i=0; i<n; i++){
            isWork[i] = true;
        }
        
        dp = new boolean[n][k];

        for(int i=0; i<cs.length; i++){
            if(cs[i] != 'x'){
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                ArrayList<Integer> ii = new ArrayList<Integer>();
                ArrayList<Integer> jj = new ArrayList<Integer>();                
                ii.add(i);
                jj.add(k-1);
                tansaku(cs, i, c, k-1, list, ii, jj);
            }
        }

        for(int i=0; i<n; i++){
            if(isWork[i]){
                System.out.print((i+1) + " ");
            }
        }
    }

    static void tansaku(char[] cs, int lastIdx, int c, int havetowork, ArrayList<Integer> list, ArrayList<Integer> ii, ArrayList<Integer> jj){
        if(havetowork == 0){
            int nextStart = 0;
            while(!list.isEmpty()){
                int item = list.remove(0);
                for(int i=nextStart; i<item; i++){
                    isWork[i] = false;
                }
                nextStart = item + 1;
            }
            for(int i=nextStart; i<cs.length; i++){
                isWork[i] = false;
            }

            while(!ii.isEmpty()){
                try{
                    dp[ii.remove(0)][jj.remove(0)] = true;
                }catch(Exception e){

                }
            }
            return;
        }

        if(dp[lastIdx][havetowork]){
            int nextStart = 0;
            while(!list.isEmpty()){
                int item = list.remove(0);
                for(int i=nextStart; i<item; i++){
                    isWork[i] = false;
                }
                nextStart = item + 1;
            }

            while(!ii.isEmpty()){
                try{
                    dp[ii.remove(0)][jj.remove(0)] = true;
                }catch(Exception e){

                }
            }
            return;
        }

        for(int i=lastIdx+1+c; i<cs.length; i++){
            if(cs[i] != 'x'){
                ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
                newlist.add(i);
                ArrayList<Integer> newII = (ArrayList<Integer>) ii.clone();
                newII.add(i);
                ArrayList<Integer> newJJ = (ArrayList<Integer>) jj.clone();
                newJJ.add(havetowork-1);
                tansaku(cs, i, c, havetowork-1, newlist, newII, newJJ);
            }
        }
    }
}