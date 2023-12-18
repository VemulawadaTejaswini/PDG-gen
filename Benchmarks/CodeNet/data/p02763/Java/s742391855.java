
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        Map<Character, Set<Integer>> charToPos = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char current = s.charAt(i);
            Set<Integer> poses = charToPos.getOrDefault(current, new HashSet<>());
            poses.add(i + 1);
            charToPos.put(current, poses);
        }
        int query = scanner.nextInt();
        for (int i = 0; i < query; ++i) {
            int type = scanner.nextInt();

            if (type == 1) {
                int a = scanner.nextInt();
                char newChar = scanner.next().charAt(0);
                char oldChar = s.charAt(a - 1);
                charToPos.get(oldChar).remove(a);
                Set<Integer> newCharPoses = charToPos.getOrDefault(newChar, new HashSet<>());
                newCharPoses.add(a);
                charToPos.put(newChar, newCharPoses);
            } else if (type == 2) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int diff = 0;
                for (int j = 0; j < 26; ++j) {
                    char currentChar = (char)('a' + j);
             //       System.out.println("currentChar: " + currentChar);
                    Set<Integer> poses = charToPos.getOrDefault(currentChar, new HashSet<>());
                    if (poses.isEmpty()) {
                        continue;
                    }
                    if (poses.contains(l) || poses.contains(r)) {
                        ++diff;
                        continue;
                    }

                    long count = poses.parallelStream()
                            .filter(pos -> pos >= l && pos <= r)
                            .count();
                    if (count > 0) {
                        ++diff;
                    }
                    //        System.out.println("lIndex: "+ lIndex);
           //         System.out.println("diff: " + diff);
                }
                System.out.println(diff);
        //        System.out.println("===========");
            }
        }
    }
}
