import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        boolean good = true;
        for (int i = 0; i < n.length() - 2; i++) {
            if (n.charAt(i) != n.charAt(i + 1)) good = false;
        }
        if (!good){
            good = true;
            for (int i = 1; i < n.length() - 1; i++) {
                if (n.charAt(i) != n.charAt(i + 1)) good = false;
            }
        }
        System.out.println(good?"Yes":"No");
    }
}
