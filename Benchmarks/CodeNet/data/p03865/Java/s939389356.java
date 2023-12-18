import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String next;
        String currentString;
        int depth = 0;
        int currentLength = s.length();
        Queue<String> queue  = new ArrayDeque<>();
        queue.add(s);

        outer: while (true) {
            currentString = queue.poll();
//            System.out.println(next);
            if (currentLength != currentString.length()) {
                depth++;
                currentLength--;
            }

            boolean hasNext = false;
            for (int i = 1; i < currentString.length() - 1; i++) {
                if (currentString.length() == 2)
                    break outer;
                if (currentString.charAt(i-1) != currentString.charAt(i+1)) {

                    next = currentString.substring(0,i) + currentString.substring(i+1);
                    queue.add(next);
                    hasNext = true;
                }
            }
            if (!hasNext) break;
        }

//        System.out.println(depth);
        System.out.println(depth % 2 == 1 ? "First" : "Second");
    }
}

