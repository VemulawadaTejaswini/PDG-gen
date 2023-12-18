import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.*;
import java.util.stream.LongStream;

public class Main {
    // 標準入力
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Main() throws Exception {
    }

    // 標準入力数値配列用 int
    static int[] inputIntArray() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    /* 標準入力数値配列用 long */
    static long[] inputLongArr() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        long[] longarray = new long[strarray.length];
        for (int i = 0; i < longarray.length; i++) {
            longarray[i] = Long.parseLong(strarray[i]);
        }
        return longarray;
    }

    // 標準入力数値リスト用 int
    static List<Integer> inputIntList() throws Exception {
        List<String> strList = Arrays.asList(br.readLine().trim().split(" "));
        List<Integer> intList = new ArrayList<Integer>();
        for (String elem : strList){
            intList.add(Integer.parseInt(elem));
        }
        return intList;
    }

    // 標準入力数値配列用 integer 降順ソート用
    static Integer[] inputvalInteger() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        Integer[] intarray = new Integer[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    /*標準入力long*/
    static long inputLong() throws Exception {
        return Long.parseLong(br.readLine());
    }

    /*標準入力long*/
    static int inputInt() throws Exception {
        return Integer.parseInt(br.readLine());
    }

    static boolean checkBit(List<Integer> bitl, int[][] xyl) throws Exception {
        for(int bit :bitl){
            for (int bit2 : bitl){
                boolean bitf = false;
                if(bit != bit2){
                    for(int [] xy : xyl){
                        if(xy[0] == bit && xy[1] == bit2 || xy[1] == bit && xy[0] == bit2){
                            bitf = true;
                            break;
                        }
                    }
                    if(! bitf){
                        return false;
                    }

                }
            }
        }
        return true;

    }

    // start

    public static void main(String[] args) throws Exception {
        // write your code here
        // 四方向への移動ベクトル
        int dx[] = {1, 0, -1, 0};
        int dy[] = {0, 1, 0, -1};

        int [] hw = inputIntArray();
        int h = hw[0];
        int w = hw[1];
        char [][] cl = new char [h][w];
        int white = 0;
        int route = 0;
        for(int i=0;i<h;i++){
            cl[i] =  br.readLine().trim().toCharArray();
            for (char c : cl[i]){
                if(c == '.'){
                    white++;
                }
            }
        }
        int [] start = new int []{0,0,0};

        boolean [][] seen = new boolean [h][w];
        for(boolean [] s: seen) {
            Arrays.fill(s, false);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(start);
        seen[start[0]][start[1]] = true;
        // bfs
        while(! queue.isEmpty()){
            int[] checkC = queue.poll();
            int checkY = checkC[0];
            int checkX = checkC[1];
            if (checkC[0] == h-1 && checkC[1] == w-1){
                route = checkC[2];
                break;
            }
            for (int dir=0; dir<4; dir ++){
                if (checkY + dy[dir] >= h || checkY + dy[dir] <0 ||
                            checkX + dx[dir] >= w || checkX + dx[dir] <0) continue; // 場外チェック
                if(seen[checkY + dy[dir]][checkX + dx[dir]]) continue; // 探索済はスルー
                if (cl[checkY + dy[dir]][checkX + dx[dir]] == 'X' ) continue; // 壁チェック
                    seen[checkY + dy[dir]][checkX + dx[dir]] = true; // この時点で探索済にする
                    queue.add(new int [] {checkY + dy[dir], checkX + dx[dir],checkC[2]+1});
                }
            }

        if (route == 0){
            System.out.println(-1);
        }else{
            System.out.println(white-route-1);
        }
    }

}

