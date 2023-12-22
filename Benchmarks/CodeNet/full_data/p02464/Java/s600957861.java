import java.util.*;
import java.io.*;
// import java.time.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }

        int m = sc.nextInt();

        List<Integer> ans = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(sc.next());
            while (index < a.size() && a.get(index) < tmp) {
                index++;
            }
            if (index == a.size()) break;
            if (a.get(index) == tmp) ans.add(tmp);
        }

        for (int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i)).append("\n");
        }

        PrintWriter out = new PrintWriter(System.out);
        out.print(sb);
        out.flush();
        
        sc.close();
    }
}

