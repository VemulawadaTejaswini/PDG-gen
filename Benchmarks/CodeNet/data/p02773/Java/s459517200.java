import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        int n = Integer.parseInt(sc.next());
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = sc.next();
        }
        Arrays.sort(ss);
        StringBuilder sb = new StringBuilder();
        for (String s : ss) {
            sb.append(s);
        }
        int max = 0;
        for (String s : ss) {
            max = Math.max((sb.lastIndexOf(s) - sb.indexOf(s)) / s.length() + 1, max);
        }
        List<String> list = new ArrayList<>();
        for (String s : ss) {
            if (max == (sb.lastIndexOf(s) - sb.indexOf(s)) / s.length() + 1) {
                list.add(s);
            }
        }
        list.stream().distinct().forEach(out::println);
        out.flush();
    }
}