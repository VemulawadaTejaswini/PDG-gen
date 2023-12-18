import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            list.add(str);
        }
        sc.close();

        for (int i = 0; i < 100; i++) {
            list = row(list);
            list = column(list);
        }

        for (String line : list) {
            System.out.println(line);
        }
    }

    static List<String> row(List<String> in) {
        List<String> out = new ArrayList<>();
        for (String line : in) {
            if (line.contains("#")) {
                out.add(line);
            }
        }
        return out;
    }

    static List<String> column(List<String> in) {
//        List<String> out = new ArrayList<>();
        if (in.size() == 0) {
//            return out;
            return new ArrayList<>();
        }

        boolean[] deleteTarget = new boolean[in.get(0).length()];
        for (int i = 0; i < in.get(0).length(); i++) {
            boolean target = true;
            for (String line : in) {
                if (line.charAt(i) == '#') {
                    target = false;
                    break;
                }
            }
            if (target) {
                deleteTarget[i] = true;
            }
        }

        List<String> out = in;
        for (int i = deleteTarget.length - 1; i >= 0; i--) {
            final int loc = i;
            if (deleteTarget[i]) {
                out = out.stream().map(e -> {
                    return e.substring(0, loc) + e.substring(loc + 1);
                }).collect(Collectors.toList());
            }
        }
        return out;
    }
}
