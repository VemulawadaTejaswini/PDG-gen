import java.io.*;
import java.util.HashSet;
import java.util.Set;

class Main {
    static Integer[] dp;
    static int INF = (int) 1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        char[] arr = in.readLine().toCharArray();
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            Set<Integer> newSet = new HashSet<>();
            for(int num : set) {
                num = num * 10 + arr[i] - '0';
                num %= 2019;
                if(num == 0) {
                    res++;
                } else {
                    newSet.add(num);
                }
            }
            newSet.add(arr[i]-'0');
            set = newSet;
        }
        out.println(res);
        out.close();
        in.close();
    }
}