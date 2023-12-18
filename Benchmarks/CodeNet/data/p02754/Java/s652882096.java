import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long count1 = 0;
        long count2 = 0;
        while(count1 < n) {
            for(long i=0; i<a; i++) {
                if(count1 < n) {
                    count1++;
                    count2++;
                }
            }
            for(long i=0; i<b; i++) {
                if(count1 < n) {
                    count1++;
                }
            }
        }
        System.out.println(count2);
    }
}