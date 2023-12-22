import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int a = sc.nextInt();

        Set<String> set = new HashSet<>();

        for (int i=0; i<a; i++) set.add(sc.next());

        System.out.println(set.size());
    }
}
