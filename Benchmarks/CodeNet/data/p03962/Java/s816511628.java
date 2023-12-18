import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < 3; i++) {
            s.add(inp.nextInt());
        }
        System.out.println(s.size());
    }
}