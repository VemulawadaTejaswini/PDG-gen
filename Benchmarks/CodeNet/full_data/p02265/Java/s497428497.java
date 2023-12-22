import java.util.*;

public class Main {
    static Deque<String> list = new ArrayDeque<String>();

    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] sp = new String[2];
        try {
            for (int i = 0; i < n; i++) {
                sp = sc.nextLine().split(" ");
                if (sp[0].equals("insert")) {
                    list.addFirst(sp[1]);
                } else if (sp[0].equals("delete")) {
                    list.remove(sp[1]);
                } else if (sp[0].equals("deleteFirst")) {
                    list.removeFirst();
                } else if (sp[0].equals("deleteLast")) {
                    list.removeLast();
                }
            }
            sc.close();
            if (!list.isEmpty()) {
                ans.append(list.getFirst());
                list.removeFirst();
            }
            while (!list.isEmpty()) {
                ans.append(" ").append(list.getFirst());
                list.removeFirst();
            }
            System.out.println(ans.toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
