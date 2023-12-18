import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int safety = sc.nextInt();
        int buy = sc.nextInt();
        int eat = sc.nextInt();
        
        if (-buy + eat <= 0) {
            System.out.println("delicious");
        } else if (-buy + eat <= safety) {
            System.out.println("safe");
        } else {
            System.out.println("dangerouds");
        }
    }
}