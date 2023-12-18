import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = String.valueOf(A[i]);
        }
        List<String> slist = new ArrayList<String>(Arrays.asList(s));
        for (int j = 0; j < N; j++) {
            slist.remove(s[j]);
            String[] snew = (String[]) slist.toArray(new String[slist.size()]);
            int[] A1 = new int[N - 1];
            for (int k = 0; k < N - 1; k++) {
                A1[k] = Integer.valueOf(snew[k]);
            }
            slist.add(s[j]);
            int[] max = new int[N];
            quick_sort(A1,0,N-2);
            max[j] = A1[N-2];
            System.out.println(max[j]);
        }
        scan.close();
    }
    static void quick_sort(int[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r); 
        quick_sort(d, l, right); 
    }
}