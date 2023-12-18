import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

import util.Utils;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.nextLine();
            int K = Integer.parseInt(in.nextLine());
            // StringBuilder sb = new StringBuilder();
            // for (int i = 0; i < 5000; i++) {
            // sb.append((char) ('a' + ((int) (26 * Math.random()))));
            // }
            // String s = sb.toString();
            // int K = 5;

            // char min = (char) 1e9;
            // ArrayList<Integer> indexes = new ArrayList<>();
            // for (int i = 0; i < s.length(); i++) {
            // char c = s.charAt(i);
            // if (c < min) {
            // min = c;
            // indexes.clear();
            // indexes.add(i);
            // } else if (c == min) {
            // indexes.add(i);
            // }
            // }
            //
            // if (K == 1) {
            // System.out.println(min);
            // return;
            // }

            HashSet<String> subs = new HashSet<>();
            // for (int i = 0; i < indexes.size(); i++) {
            for (int i = 0; i < s.length(); i++) {
                // int index = indexes.get(i).intValue();
                int index = i;
                for (int j = 0; j < K; j++) {
                    if (index + 1 + j <= s.length()) {
                        subs.add(s.substring(index, index + 1 + j));
                    }
                }
            }
            ArrayList<String> subs2 = new ArrayList<>();
            subs2.addAll(subs);
            Collections.sort(subs2);

            Utils.debug(subs2);

            System.out.println(subs2.get(K - 1));

        }
    }
}
