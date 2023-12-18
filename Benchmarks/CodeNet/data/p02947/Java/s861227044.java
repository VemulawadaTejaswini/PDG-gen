import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        HashMap<String, Integer> map = new HashMap<>();
        long ans = 0;
        for(int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            char[] c = line.toCharArray();
            Arrays.sort(c);
            String sortedLine = new String(c);

            if(map.containsKey(sortedLine)) {
                ans += map.get(sortedLine);
                map.put(sortedLine, map.get(sortedLine) + 1);
            } else {
                map.put(sortedLine, 1);
            }
        }
        System.out.println(ans);
    }
}
