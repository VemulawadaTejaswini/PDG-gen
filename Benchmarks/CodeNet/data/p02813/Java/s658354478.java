import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        StringBuilder P = new StringBuilder();
        StringBuilder Q = new StringBuilder();
        StringBuilder base = new StringBuilder();
        int a = 0;
        int b = 0;
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < N; i++) {
            P.append(sc.next());
        }

        for (int i = 0; i < N; i++) {
            Q.append(sc.next());
        }

        if (P.toString().equals(Q.toString())) {
            out.println("0");
            sc.close();
            out.flush();
            return;
        }

        for (Integer i = 1; i <= N; i++) {
            base.append(i.toString());
        }

        String Base = base.toString();
        while (!(nextPermutation(Base).equals(P.toString()))) {
            Base = nextPermutation(Base);
            a++;
        }

        Base = base.toString();
        while (!(nextPermutation(Base).equals(Q.toString()))) {
            Base = nextPermutation(Base);
            b++;
        }

        out.println(Math.abs(a - b));
        sc.close();
        out.flush();
    }

    static String nextPermutation(String s) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            list.add(s.charAt(i));

        int pivotPos = -1;
        char pivot = 0;
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i + 1)) {
                pivotPos = i;
                pivot = list.get(i);
                break;
            }
        }

        if (pivotPos == -1 && pivot == 0)
            return "Final";

        int L = pivotPos + 1, R = list.size() - 1;
        int minPos = -1;
        char min = Character.MAX_VALUE;
        for (int i = R; i >= L; i--) {
            if (pivot < list.get(i)) {
                if (list.get(i) < min) {
                    min = list.get(i);
                    minPos = i;
                }
            }
        }

        Collections.swap(list, pivotPos, minPos);
        Collections.sort(list.subList(L, R + 1));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
            sb.append(list.get(i));

        return sb.toString();

    }

}