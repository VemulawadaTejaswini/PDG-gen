import java.util.*;

public class Main {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int N = scanner.nextInt();
           int bit = 0;
           for(int i = 0; i < N; i++) {
               bit |= scanner.nextInt();
           }
           System.out.println(Integer.numberOfLeadingZeros(bit));
    }
}