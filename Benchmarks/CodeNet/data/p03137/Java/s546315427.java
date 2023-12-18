import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] komaAndX = br.readLine().split(" ");
        int komaNumber = Integer.parseInt(komaAndX[0]);
        int XNumber = Integer.parseInt(komaAndX[1]);
        
        if(komaNumber >= XNumber) {
            System.out.println(0);
            return;
        } // コマの数が座標より多い場合
        
        String[] strXs = br.readLine().split(" ");
        int[] Xs = new int[XNumber];
        for(int i = 0; i < XNumber; i++){
            Xs[i] = Integer.parseInt(strXs[i]);
        }
        Arrays.sort(Xs);
        int[] distances = new int[XNumber - 1];
        for(int i = 0; i < Xs.length - 1; i++){
            distances[i] = Xs[i + 1] - Xs[i];
        }
        Arrays.sort(distances);
        
        int totalMove = 0;
        for(int i = 0; i < distances.length && i < distances.length - komaNumber + 1; i++){
            totalMove += distances[i];
        }
        System.out.println(totalMove);
    }
}
