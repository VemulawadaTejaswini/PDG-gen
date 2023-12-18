import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        List<Integer> group01 = new ArrayList<>();
        List<Integer> group02 = new ArrayList<>();
        List<Integer> group03 = new ArrayList<>();

        group01.add(1);
        group01.add(3);
        group01.add(5);
        group01.add(7);
        group01.add(8);
        group01.add(10);
        group01.add(12);

        group02.add(4);
        group02.add(6);
        group02.add(9);
        group02.add(11);

        group03.add(2);


        if ((group01.contains(x) && group01.contains(y))
        || (group02.contains(x) && group02.contains(y))
        || (group03.contains(x) && group03.contains(y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
