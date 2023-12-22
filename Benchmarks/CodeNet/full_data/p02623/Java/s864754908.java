
import java.io.*;
import java.util.Arrays;

public class Main {

    private static int[] bookA;
    private static int[] bookB;
    private static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        int time = Integer.parseInt(temp[2]);

        bookA = new int[a];
        bookB = new int[b];

        temp = br.readLine().split(" ");
        for(int i=0;i<a;i++){
            bookA[i] = Integer.parseInt(temp[i]);
        }

        temp = br.readLine().split(" ");
        for(int i=0; i<b;i++){
            bookB[i] = Integer.parseInt(temp[i]);
        }

        DFS(time, 0, 0, 0);

        System.out.println(max);

    }

    private static void DFS(int time, int idxA, int idxB, int count){

        max = Math.max(max, count);

        if(idxA < bookA.length){
            if(time >= bookA[idxA]){
                time -= bookA[idxA];
                DFS(time, idxA+1, idxB, count+1);
                time += bookA[idxA];
            }
        }


        if(idxB < bookB.length){
            if(time >= bookB[idxB]){
                time -= bookB[idxB];
                DFS(time, idxA, idxB+1, count+1);
                time += bookB[idxB];
            }
        }

    }
}
