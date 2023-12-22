
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * D2
 */
public class Main {

    private static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int len = Integer.parseInt(line);
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        List<Integer> G = makeH(len);
        for(int i=G.size()-1; i>=0; i--) {
            insertionSort(arr, len, G.get(i));
            System.out.print(G.get(i) + " ");
        }
        System.out.println();
        System.out.println(cnt);
        for(int s: arr){
            System.out.println(s);
        }
    }

    private static void insertionSort(int[] arr, int len, int g){
        for(int i=g; i<len; i++){
            int v = arr[i];
            int j = i-g;
            while (j >= 0 && arr[j] > v){
                arr[j+g] = arr[j];
                j = j - g;
                cnt++;
            }
            arr[j+g] = v;
        }
    }

    private static List<Integer> makeH(int len){
        List<Integer> list = new ArrayList<>();
        int n = 0;
        int max = 0;
        while(true){
            n = n*3 + 1;
            if(len < n) break;
            list.add(n);
            max++;
        }
        System.out.println(max);
        return list;
    }
}
