import java.util.*;
class Main{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[] c = new char[w];
        int[][] map= new int[h][w];
        int t = 0;
        for(int i = 0; i < h; i++){
            c = sc.next().toCharArray();
            }
        
            for(int i = 0; i < h; i++){
            t = -1;
            for(int j = 0; j < w ; j++){
                if(c[j] == 'c') t = 0;
                map[i][j] = t;
                if(t != -1) t++;
            }
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if( j == w-1) System.out.println(map[i][j]);
                else{
                    System.out.print(map[i][j]+" ");
                }
            }
        }
    }
}