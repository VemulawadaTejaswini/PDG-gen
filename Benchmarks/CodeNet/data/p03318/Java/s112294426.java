import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long K = in.nextLong();
        long toPrint = 0L;
        for(int i=1;i<=K;i++){
            if(i<=9) toPrint += 1L;
            else if(10<=i&&i<=18) toPrint += 10L;
            else toPrint += 100L;
            System.out.println(toPrint);
        }

    }
}