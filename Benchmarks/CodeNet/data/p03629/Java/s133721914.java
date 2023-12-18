import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    private static String solve(Scanner scanner) {
        String s = scanner.nextLine();

        HashMap<Character, TreeSet<Integer>> c2inds = new HashMap<>();
        for (int i = 0; i < s.length(); i ++) {
            Character c = s.charAt(i);
            TreeSet<Integer> inds = c2inds.getOrDefault(c, new TreeSet<>());
            inds.add(i);
            c2inds.put(c, inds);
        }

        int len = 1;
        while (true) {
            LinkedList<String> strs = listupStrs(len);
            for (String str: strs) {
                Integer ind = -1;
                for (int si = 0; si < str.length(); si ++) {
                    TreeSet<Integer> inds = c2inds.getOrDefault(str.charAt(si), null);
                    if (inds == null) return str;

                    ind = inds.higher(ind);
                    if (ind == null) return str;
                }
            }
            len ++;
        }
    }

    private static LinkedList<String> listupStrs(int len) {
        LinkedList<String> ret = new LinkedList<>();

        if (len == 0) {
            ret.add("");
            return ret;
        }

        LinkedList<String> seed = listupStrs(len - 1);

        for (int i = 0; i < 26; i ++) {
            for (String s: seed) {
                char c = (char) ((int) 'a' + i);
                ret.add(c + s);
            }
        }

        return ret;
    }

    private static final String ex1 = "atcoderregularcontest";
    private static final String ex2 = "abcdefghijklmnopqrstuvwxyz";
    private static final String ex3 = "frqnvhydscshfcgdemurlfrutcpzhopfotpifgepnqjxupnskapziurswqazdwnwbgdhyktfyhqqxpoidfhjdakoxraiedxskywuepzfniuyskxiyjpjlxuqnfgmnjcvtlpnclfkpervxmdbvrbrdn";

    public static void main(String[] args) {
//        System.out.println(solve(new Scanner(ex1)));
//        System.out.println(solve(new Scanner(ex2)));
//        System.out.println(solve(new Scanner(ex3)));

        System.out.println(solve(new Scanner(System.in)));
    }


}
