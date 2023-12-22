import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        sc.close();
        
        int year = 0;
        
        long kouza = 100L;
        
        while(kouza < X) {
            year++;
            long risi = kouza * 1 / 100;
            kouza += risi;
        }
        
        System.out.println(year);
    }

}
