import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int N;
    static ArrayList<String> s;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        s = new ArrayList<>();

        scanner.nextLine();
        for(int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            ArrayList<Character> list = new ArrayList<>();
            for(int j = 0; j < 10; j++) {
                list.add(line.charAt(j));
            }
            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for(Character c: list) {
                sb.append(c);
            }
            s.add(sb.toString());
        }
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        long ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                if(s.get(i).equals(s.get(j))) ans++;
            }
        }

        System.out.println(ans);
    }
}