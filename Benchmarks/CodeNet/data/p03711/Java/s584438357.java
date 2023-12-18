import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        List<Integer> l1 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> l2 = Arrays.asList(4, 6, 9, 11);
        List<Integer> l3 = Arrays.asList(2);

        if (l1.contains(x) && l1.contains(y)
                || l2.contains(x) && l2.contains(y)
                || l3.contains(x) && l3.contains(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
