
import java.util.*;

public class Main {
    private final static Main main = new Main();

    public static void main(String[] args) {
        main.contest();
    }

    private void contest() {
        Scanner sc = new Scanner(System.in);
        System.out.println((sc.nextInt()+sc.nextInt())%24);
    }
}
