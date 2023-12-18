import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.next());
        int oneYen = Integer.parseInt(sc.next());
        
        System.out.println((total%500)>oneYen?"No":"Yes");
    }
}
