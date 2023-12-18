import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer quantity = sc.nextInt();
        Set<Integer> NumSet = new HashSet<Integer>();
        boolean flg = false;
        for (int i = 0; i < quantity; i++){
            if (!NumSet.add(sc.nextInt())) {
                flg = true;
                System.out.println("NO");
                break;
            }
        }
        if (!flg) {
            System.out.println("YES");
        }
    }
}