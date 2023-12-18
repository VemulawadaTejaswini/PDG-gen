import java.util.*;
public class HinaArare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Character> list = new ArrayList<Character>();
        while (n-- > 0)
            list.add(sc.next().charAt(0));
        List<Character> list2 = new ArrayList<Character>(new HashSet<>(list));
        if (list2.size() == 4) {
            System.out.println("Four");
        } else if (list2.size() == 3) {
            System.out.println("Three");
        }
    }
}