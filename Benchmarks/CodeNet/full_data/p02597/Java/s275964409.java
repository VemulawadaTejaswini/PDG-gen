import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();

        List<Boolean> stones = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stones.add(input.charAt(i) == 'R');
        }

        int current;
        int wIndex;
        long steps = 0;
        while ((wIndex = stones.indexOf(false)) < (current = stones.lastIndexOf(true))
                && stones.contains(false)
                && stones.contains(true)
        ) {
            stones.set(wIndex, true);
            stones = stones.subList(0, current);
            steps++;
        }
        System.out.println(steps);
    }
}
