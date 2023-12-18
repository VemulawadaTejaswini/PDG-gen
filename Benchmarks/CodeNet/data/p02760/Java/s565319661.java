import java.util.*;
import java.io.*;

public class Main implements Runnable{
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException{
        new Thread(null, new Main(), "", 32 * 1024 * 1024).start();
        Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        out.flush();
    }

    public void run(){
        int[][] A = new int[3][3];
        boolean[][] check = new boolean[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                A[i][j] = Integer.parseInt(sc.next());
            }
        }
        int N = Integer.parseInt(sc.next());
        int[] b = new int[N];
        for(int i = 0; i < N; i++){
            b[i] = Integer.parseInt(sc.next());
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    if(A[j][k] == b[i]) check[j][k] = true;
                }
            }
        }
        if(check[0][0]&&check[0][1]&&check[0][2]){
            out.println("Yes");
        }else if(check[1][0]&&check[1][1]&&check[1][2]){
            out.println("Yes");
        }else if(check[2][0]&&check[2][1]&&check[2][2]){
            out.println("Yes");
        }else if(check[0][0]&&check[1][0]&&check[2][0]){
            out.println("Yes");
        }else if(check[0][1]&&check[1][1]&&check[2][1]){
            out.println("Yes");
        }else if(check[0][2]&&check[1][2]&&check[2][2]){
            out.println("Yes");
        }else if(check[0][0]&&check[1][1]&&check[2][2]){
            out.println("Yes");
        }else if(check[0][2]&&check[1][1]&&check[2][0]){
            out.println("Yes");
        }else{
            out.println("No");
        }
        out.flush();
    }

}