import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        long bit = A;
        for(long i = A; i < B; i++){
            bit = bit ^ (i+1);
        }

        System.out.print(bit);

    }
}