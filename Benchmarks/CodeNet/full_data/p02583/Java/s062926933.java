import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.*;
import static java.lang.Long.parseLong;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = parseInt(read.readLine());
        st = new StringTokenizer(read.readLine());
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++){
            arr[i] = parseLong(st.nextToken());
        }
        prnt.println(getNumberWay(arr, n));

        prnt.close();


    }

    static long getNumberWay(Long[] arr, int n) {
        long res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = (i + 1); j < n; j++) {
                for (int k = (j + 1); k < n; k++) {
                    if (arr[i] != arr[j] && arr[j] != arr[k] && arr[k] != arr[i]) {
                        if ((arr[i] + arr[j]) > arr[k] && (arr[i] + arr[k]) > arr[j] && (arr[j] + arr[k]) > arr[i]) {
                            res++;
                           // System.out.println(i + " " + j + " " + k);
                        }
                    }
                }
            }
        }
        return res;
    }
}