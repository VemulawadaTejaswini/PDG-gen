import java.io.*;

class Ans {

    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while (true) {
                input = r.readLine();
                if (input == null) break;
                String[] ns = input.split("[+=]");
                System.out.println(solve(ns));
            }
        } catch (Exception e) {}
    }

    public static String solve(String[] ns) {
        for (int X = 0; X <= 9; X++) {
            int[] ns_i = new int[126];
            for (int i = 0; i < ns.length; i++) {
                ns_i[i] = Integer.parseInt(ns[i].replace("X", String.valueOf(X)));
            }
            if (ns_i[0] + ns_i[1] == ns_i[2]) {
                return String.valueOf(X);
            }
        }
        return "NA";
    }
}