import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> A = new HashMap<>();
        HashSet<Integer> solved = new HashSet<>();

        for (int i = 1; i <= N; i++) {
            A.put(i, 0);
        }

        int ac = 0;
        int penalties = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine());
            int p = Integer.parseInt(st.nextToken());
            String v = st.nextToken();
            if (v.equals("AC") && !solved.contains(p)) {
              ac ++;
              penalties += A.getOrDefault(p, 0);
              solved.add(p);
            } else {
                A.put(p, A.get(p) + 1);
            }
        }
        out.println(ac + " " + penalties);
    }

}
