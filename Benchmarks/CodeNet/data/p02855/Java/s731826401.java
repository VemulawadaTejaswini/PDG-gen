import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    static int h;
    static int w;
    static int k;
    static String[][] s;
    static int[][] r;

    static void paint(int kk, int i, int j) {
        r[i][j] = kk;
        boolean[] flag = new boolean[8];
        for(int l = 0;l < 8;l++){
            flag[l] = false;
        }
        if(isOK(i-1,j-1)){
            flag[0] = true;
        }
        if(isOK(i-1,j)){
            flag[1] = true;
        }
        if(isOK(i-1,j+1)){
            flag[2] = true;
        }
        if(isOK(i,j-1)){
            flag[3] = true;
        }
        if(isOK(i,j+1)){
            flag[4] = true;
        }
        if(isOK(i+1,j-1)){
            flag[5] = true;
        }
        if(isOK(i+1,j)){
            flag[6] = true;
        }
        if(isOK(i+1,j+1)){
            flag[7] = true;
        }
        while(!isRect(flag)){
            for(int m = 7;m >= 0;m--){
                if(flag[m]){
                    flag[m] = false;
                    break;
                }
            }
        }
        if(flag[0]){
            r[i-1][j-1] = kk;
        }
        if(flag[1]){
            r[i-1][j] = kk;
        }
        if(flag[2]){
            r[i-1][j+1] = kk;
        }
        if(flag[3]){
            r[i][j-1] = kk;
        }
        if(flag[4]){
            r[i][j+1] = kk;
        }
        if(flag[5]){
            r[i+1][j-1] = kk;
        }
        if(flag[6]){
            r[i+1][j] = kk;
        }
        if(flag[7]){
            r[i+1][j+1] = kk;
        }
    }
    static boolean isOK(int i, int j){
        if(i < 0 || i >= h || j < 0 || j >= w){
            return false;
        }else {
            if(s[i][j].equals("#") || r[i][j] != 0){
                return false;
            }
            return true;
        }
    }
    static boolean isRect(boolean[] f){
        int count = 0;
        for(int i = 0;i < 8;i++){
            if(f[i]){
                count++;
            }
        }
        if(count == 0){
            return true;
        }
        if(count == 8){
            return true;
        }
        if(count == 2){
            if(f[1] && f[6] || f[3] && f[4]){
                return true;
            }
        }
        if(count == 1){
            if(f[1] || f[3] || f[4] || f[6]){
                return true;
            }
        }
        if(count == 3){
            if(f[0]&&f[1]&&f[3] || f[1]&&f[2]&&f[4] || f[3]&&f[5]&&f[6] || f[4]&&f[6]&&f[7]){
                return true;
            }
        }
        if(count == 5){
            if(f[0]&&f[1]&&f[2]&&f[3]&&f[4] || f[3]&&f[4]&&f[5]&&f[6]&&f[7] || f[0]&&f[1]&&f[3]&&f[5]&&f[6] || f[4]&&f[1]&&f[2]&&f[6]&&f[7]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        h = stdIn.nextInt();
        w = stdIn.nextInt();
        k = stdIn.nextInt();
        s = new String[h][w];
        r = new int[h][w];
        for(int i = 0;i < h;i++){
            String ss= stdIn.next();
            String[] sss = ss.split("");
            for(int j = 0;j < w;j++){
                s[i][j] = sss[j];
            }
        }

        int count = 0;
        for(int i = 0;i < h;i++){
            for(int j = 0;j < w;j++){
                if(s[i][j].equals("#")){
                    count++;
                    paint(count,i,j);
                }
            }
        }
        for(int i = 0;i < h;i++){
            for(int j = 0;j < w;j++){
                System.out.println(r[i][j]);
            }
        }
    }
}