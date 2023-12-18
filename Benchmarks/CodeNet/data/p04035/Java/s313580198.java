import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        int N = Integer.parseInt(in1[0]);
        int L = Integer.parseInt(in1[1]);
        
        in1 = br.readLine().split(" ");
        int[] a = Stream.of(in1).mapToInt(Integer::parseInt).toArray();
        br.close();

        int last_cut_rope_idx = 0;
        for(int i = 0; i < N-1; i++){
            if(a[i] + a[i+1] >= L) {
                last_cut_rope_idx = i + 1;
            }
        }

        System.out.println(last_cut_rope_idx != 0 ? "Possible" : "Impossible");
        
        if(last_cut_rope_idx != 0){
            int cut_rope = 1;
            while(cut_rope != last_cut_rope_idx){
                System.out.println(cut_rope);
                cut_rope++;
            }

            cut_rope = N - 1;
            while(cut_rope != last_cut_rope_idx){
                System.out.println(cut_rope);
                cut_rope--;
            }
        
            System.out.println(last_cut_rope_idx);
        }
    }
}