import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        char[] arr = sc.next().toCharArray();

        if ((arr[0]==arr[1] && arr[1]==arr[2]) || (arr[1]==arr[2] && arr[2]==arr[3])) System.out.println("Yes\n");
        else System.out.println("No");
    }

}
