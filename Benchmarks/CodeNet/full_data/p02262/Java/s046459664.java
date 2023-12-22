import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    static long cnt;
    static int l;
    static int[] A = new int[1000000];
    static int n;
    static ArrayList<Integer> G = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        cnt = 0;

        shellSort(A, n);

        StringBuilder sb = new StringBuilder();
        sb.append(G.size()).append("\n");
        for(int i = G.size() - 1; i >= 0; i--){
            if(i != G.size() - 1)sb.append(" ");
            sb.append(G.get(i));
        }
        sb.append("\n");
        sb.append(cnt).append("\n");
        for(int i = 0; i < n; i++){
            sb.append(A[i]).append("\n");
        }
        System.out.print(sb);
    }
    public static void shellSort(int[] A, int n){
        for(int h = 1; ; ){
            if(h > n) break;
            G.add(h);
            h = 3 * h + 1;
        }

        for(int i = G.size() - 1; i >= 0; i--){
            insertionSort(A, n, G.get(i));
        }
    }

    public static void insertionSort(int[] A, int n, int g){
        //int temp;                                                                    
        for(int i = g; i < n; i++){
            int v = A[i];
            int j = i - g;
            while( j >= 0 && A[j] > v){
                A[j + g] = A[j];
                j -= g;
                cnt++;
            }
            A[j + g] = v;
        }
    }

}