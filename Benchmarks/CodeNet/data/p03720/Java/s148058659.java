import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;
    Set<String> set = new HashSet<>();
    int K;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] array = new int[N][N];

        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            array[a-1][b-1] += 1;
            array[b-1][a-1] += 1;
        }

        for(int i=0; i<N; i++){
            int count = 0;
            for(int j=0; j<N; j++){
                count+=array[i][j];
            }
            System.out.println(count);
        }
    }

    void substring(String s, int num){
        for(int i=1; i<=num; i++){
            if(i > K){
                break;
            }
            for(int j=0; j<num; j++){
                if(j + i-1 < num){
//                    System.out.println(s.substring(j, j+i));
                    set.add(s.substring(j, j+i));
                } else {
                    break;
                }
            }
        }
    }

    void permutation(String s, String ans){
        if(s.length() <= 1){
            System.out.println(ans + s);
        } else {
            for(int i=0; i<s.length(); i++){
                permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
            }
        }
    }
}