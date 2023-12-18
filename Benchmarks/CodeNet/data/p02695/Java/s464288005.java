import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    static int recur(int[] a, int start, int max, int N, List<Integer> list, List<List<Integer>> Q) {
        if(list.size() == N) {
            int _max = verify(Q, list);
            if(_max > max) max = _max;
            return max;
        }
        for(int i = start; i < a.length; i++) {
            List<Integer> clone = new ArrayList<>();
            for(int k = 0; k < list.size(); k++) {
                clone.add(list.get(k));
            }
            clone.add(a[i]);
            int _max = recur(a, i, max, N, clone, Q);
            if(_max > max) max = _max;
        }
        return max;
    }

    private static int verify(List<List<Integer>> Q, List<Integer> list) {
        int sum = 0;
        for(int i = 0; i < Q.size(); i++) {
            List<Integer> l = Q.get(i);
            int a = l.get(0);
            int b = l.get(1);
            int c = l.get(2);
            int d = l.get(3);
            if(list.get(b - 1) - list.get(a - 1) == c) {
                sum += d;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int Q = Integer.parseInt(s[2]);
        List<List<Integer>> Ql = new ArrayList<>();
        while(Q-- > 0) {
            List<Integer> l = new ArrayList<>();
            s = in.readLine().split(" ");
            l.add(Integer.parseInt(s[0]));
            l.add(Integer.parseInt(s[1]));
            l.add(Integer.parseInt(s[2]));
            l.add(Integer.parseInt(s[3]));
            Ql.add(l);
        }
        int[] a = new int[M];
        for(int i = 0; i < M; i++) {
            a[i] = i + 1;
        }
        System.out.println(recur(a, 0, Integer.MIN_VALUE, N, new ArrayList<>(), Ql));
    }
}