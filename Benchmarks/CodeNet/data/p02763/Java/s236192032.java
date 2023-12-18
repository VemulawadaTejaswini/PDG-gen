
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        Map<Character, TreeSet<Integer>> charToPos = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char current = s.charAt(i);
            TreeSet<Integer> poses = charToPos.getOrDefault(current, new TreeSet<>());
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
                TreeSet<Integer> newCharPoses = charToPos.getOrDefault(newChar, new TreeSet<>());
                newCharPoses.add(a);
                charToPos.put(newChar, newCharPoses);
            } else if (type == 2) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int diff = 0;
                for (int j = 0; j < 26; ++j) {
                    char currentChar = (char)('a' + j);
               //     System.out.println("currentChar: " + currentChar);
                    TreeSet<Integer> poses = charToPos.getOrDefault(currentChar, new TreeSet<>());
              //      System.out.print("poses: ");
              //      poses.forEach(pos -> System.out.print(pos + " "));
               //     System.out.println();
                    if (poses.isEmpty()) {
                        continue;
                    }
                    if (poses.contains(l) || poses.contains(r)) {
                        ++diff;
                  //      System.out.println("diff: " + diff);
                        continue;
                    }
                    NavigableSet<Integer> lessLNum = poses.headSet(l, false);
                    NavigableSet<Integer> largerRNum = poses.tailSet(r, false);

                //    System.out.print("lessLNum: ");
//                    lessLNum.forEach(rnum -> System.out.print(rnum + " "));
//
//                    System.out.print("largerRNum: ");
//                    largerRNum.forEach(lnum -> System.out.print(lnum + " "));

                    long count = poses.size() - largerRNum.size() - lessLNum.size();
                    if (count > 0) {
                        ++diff;
                    }
                 //   System.out.println("count: " + count);
                //    System.out.println("diff: " + diff);
                }
                System.out.println(diff);
             //  System.out.println("===========");
            }
        }
    }
}
