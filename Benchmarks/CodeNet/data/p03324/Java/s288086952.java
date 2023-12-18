import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for(int i=0; i<n; i++){
//            array[i] = sc.nextInt();
//        }
//
//        int ansCount = 0;
//        int

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        double n = (double)sc.nextInt();

        double tmp = Math.pow(100, d);
        int ans = (int)(tmp * n);

        System.out.println(ans);
    }

//    public static int search(int[] array){
//        int waru2Count = 0;
//        int kake3Count = 0;
//
//        if(kake3Count == array.length) return
//        for(int a: array){
//
//        }
//    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int H = sc.nextInt();
//        int W = sc.nextInt();
//        char[][] charArray = new char[H][W];
//        boolean[][] grid = new boolean[H][W];
//        for(int i=0; i<H; i++){
//            char[] line = sc.next().toCharArray();
//            for(int j=0; j<W; j++){
//                charArray[i][j] = line[j];
//            }
//        }
//
//        DFS dfs = new DFS(H, W, charArray, grid, 0);
//        boolean ans = dfs.search(0, 0);
//
//        if(ans){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}
//
//class DFS{
//    private int H;
//    private int W;
//    boolean[][] grid;
//    private char[][] charArray;
//    private int count;
//
//    DFS(int H, int W, char[][] charArray, boolean[][] grid, int count){
//        this.H = H;
//        this.W = W;
//        this.charArray = charArray;
//        this.grid = grid;
//        this.count = count;
//    }
//
//    public boolean search(int x, int y){
//        if (y >= this.H || x >= this.W || x < 0 || y < 0) return false;
//        if (this.charArray[y][x] == '#') return false;
//        if (grid[y][x]) return false;
//
//        if (this.charArray[y][x] == 'g') {
//            this.count++;
//            return true;
//        }
//
//        grid[y][x] = true;
//
//        search(x + 1, y);
//        search(x - 1, y);
//        search(x, y+1);
//        search(x, y-1);
//
//        if(this.count > 0){
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
