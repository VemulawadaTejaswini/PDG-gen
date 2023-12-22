import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Collections;

public class Main {
    
    public static long cnt = 0;
    
    public static void main(String[] args) throws Exception {
        int[] A = getContents().stream().skip(1).mapToInt(Integer::parseInt).toArray();
        shellSort(A);
        System.out.println(cnt);
        for(int n : A)
            System.out.println(n);
    }
    
    public static ArrayList<String> getContents() throws IOException{
        String line;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((line = br.readLine()) != null) list.add(line);
        
        return list;
    }
    
    public static void swap(int[] A, int i, int j){
        int v = A[j];
        A[j] = A[i];
        A[i] = v;
    }
    
    public static void insertionSort(int[] A, int g){
        for(int i = g, len = A.length; i < len; ++i){
            int v = A[i];
            int j = i - g;
            while(j >= 0 && A[j] > v){
                A[j + g] = A[j];
                j -= g;
                ++cnt;
            }
            A[j + g] = v; 
        }
    }
    
    public static void shellSort(int[] A){
        int len = A.length / 9;
        int h = 1;
        List<Integer> G = new ArrayList<Integer>(Arrays.asList(h));
        while(h <= len){
            h = 3 * h + 1;
            G.add(h);
        }
        Collections.reverse(G);
        
        int m = G.size();
        System.out.println(m);
        System.out.println(G.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        
        for(int i = 0; i < m; ++i){
            insertionSort(A, G.get(i));
        }
    }
}
