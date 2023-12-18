import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    private static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int q = Integer.parseInt(sc.nextLine());

        List<String> heads = new ArrayList<>();
        List<String> tails = new ArrayList<>();

        boolean v = true;
        for (int i = 0; i < q; i++) {
            String line = sc.nextLine();
            if (line.startsWith("1")) {
                v = !v;
            } else {
                String[] split = line.split(" ");
                String c = split[2];
                if (split[1].equals("1")) { // add C to head
                    if (v) {
                        heads.add(c);
                    } else {
                        tails.add(c);
                    }
                } else {  // add C to tail
                    if (v) {
                        tails.add(c);
                    } else {
                        heads.add(c);
                    }
                }
            }
        }

        if (v) {
            Collections.reverse(heads);
            System.out.println(heads.stream().collect(Collectors.joining()) + s + tails.stream().collect(Collectors.joining()));
        } else {
            Collections.reverse(tails);
            System.out.println(tails.stream().collect(Collectors.joining())
                    + new StringBuffer(s).reverse().toString() + heads.stream().collect(Collectors.joining()));
        }
    }
}
