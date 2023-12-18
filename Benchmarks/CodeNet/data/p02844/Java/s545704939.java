import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Set<String> result = new HashSet<>();
        search(s, "", s + "&",new HashSet<>(), result);

        System.out.println(result.stream().count());
    }

    private static StringBuilder sb = new StringBuilder();
    private static void search(String s, String tmp, String stmp, Set<String> memo, Set<String> result) {
        if(tmp.length() == 3) {
            result.add(tmp);
            return;
        }
        else if(s.isEmpty()) {
            return;
        }
        else if(memo.contains(s + "&" + tmp)) {
            return;
        }

        for(int i = 0;i < s.length();i++) {
            String addedS = s.substring(i, i + 1);
            String newS = s.substring(i + 1);
            sb.setLength(0);
            String newStmp = sb.append(newS).append("&").append(tmp).append(addedS).toString();
            sb.setLength(0);
            String newTmp = sb.append(tmp).append(addedS).toString();
            search(newS, newTmp, newStmp, memo, result);
        }

        sb.setLength(0);
        memo.add(sb.append(s).append("&").append(tmp).toString());
        return;
    }

}
