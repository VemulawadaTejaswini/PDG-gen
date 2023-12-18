import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NMXY = br.readLine().split(" ");
        int N = Integer.parseInt(NMXY[0]);
        int M = Integer.parseInt(NMXY[1]);
        int X = Integer.parseInt(NMXY[2]);
        int Y = Integer.parseInt(NMXY[3]);
        String[] xiString = br.readLine().split(" ");
        String[] yiString = br.readLine().split(" ");
        
        int[] xi = new int[N];
        int[] yi = new int[M];
        for(int i = 0; i < N; i++){
            xi[i] = Integer.parseInt(xiString[i]);
        }
        Arrays.sort(xi);
        
        for(int i = 0; i < M; i++){
            yi[i] = Integer.parseInt(yiString[i]);
        }
        Arrays.sort(yi);
        if(xi[0] <= yi[M-1] && xi[N-1] >= yi[0]){
            System.out.println("War");
        } else if(yi[0] <= xi[N-1] && yi[N-1] >= xi[0]){
            System.out.println("War");
        } else {
            System.out.println("No War");
        }
    }
}
