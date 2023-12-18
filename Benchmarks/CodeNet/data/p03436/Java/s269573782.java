import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] yx = br.readLine().split(" ");
        int y = Integer.parseInt(yx[0]);
        int x = Integer.parseInt(yx[1]);
        
        char[][] arr = new char[y][];
        boolean[][] visit = new boolean[y][];
        for(int i = 0; i < y; i++) arr[i] = new char[x];
        for(int i = 0; i < y; i++) visit[i] = new boolean[x];
        
        for(int i = 0; i < y; i++){
            String temp = br.readLine();
            for(int j = 0; j < x; j++) arr[i][j] = temp.charAt(j);
        }
        
        int count = 0;
        for(int i = 0; i < y; i++){
            for(char c : arr[i])
            if(c == '#') count++;
        }
        
        int cost = shortPath(arr,1,x,y,0,0,visit);
        
        if(cost != 2500)
        System.out.println(x*y - count - cost);
        else
        System.out.println(-1);
        
        
    }
    
    private static int shortPath(char[][] arr, int val, int x, int y, int i, int j,boolean[][] visit){
        
        if(i >= y || j >= x || i < 0 || j < 0) return 2500;
        if(visit[i][j]) return 2500;
        if(i == y-1 && j == x-1) return val;
        if(arr[i][j] == '#') return 2500;
        
        visit[i][j] = true;
        int a = shortPath(arr,val+1,x,y,i+1,j,visit);
        int b = shortPath(arr,val+1,x,y,i,j+1,visit);
        int c = shortPath(arr,val+1,x,y,i-1,j,visit);
        int d = shortPath(arr,val+1,x,y,i,j-1,visit);
        return Math.min(Math.min(a,b),Math.min(c,d));
        
    }
}
