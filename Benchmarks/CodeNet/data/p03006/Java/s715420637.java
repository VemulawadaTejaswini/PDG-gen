import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ball = new int[N][2];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for (int i=0;i<N;i++){
            ball[i][0] = sc.nextInt();
            ball[i][1] = sc.nextInt();
        }
        for (int i=0;i<N;i++){
            for (int j=i;j<N;j++){
                if (ball[j][0]-ball[i][0]==0 || ball[j][1]-ball[i][1]==0){
                    continue;
                }
                ArrayList<Integer> son = new ArrayList<>();
                son.add(j);
                int x = ball[j][0] - ball[i][0];
                int y = ball[j][1] - ball[i][1];
                for (int k=j;k<N;k++){
                    if (ball[k][0]-ball[j][0]==0 || ball[k][1]-ball[j][1]==0){
                        continue;
                    }
                    if ((ball[k][0]-ball[j][0])%x==0 && (ball[k][1]-ball[j][1])%y==0){
                        son.add(k);
                    }
                }
                if (map.containsKey(i)){
                    if (map.get(i).size()<son.size()){
                        map.put(i,son);
                    }
                } else {
                    map.put(i,son);
                }
            }
        }
        ArrayList<Integer> srt = new ArrayList<>();
        while (srt.size()<map.size()){
            int max = 0;
            int pos = -1;
            for (int i=0;i<map.size();i++){
                if (srt.contains(i)){
                    continue;
                }
                if (map.get(i).size()>max){
                    max = map.get(i).size();
                    pos = i;
                }
            }
            srt.add(pos);
        }
        ArrayList<Integer> used = new ArrayList<>();
        int ans = 0;
        for (int i:srt){
            if (used.contains(i)){
                continue;
            }
            used.add(i);
            for (int j:map.get(i)){
                used.add(j);
            }
            ans++;
        }
        System.out.println(ans);
    }
}