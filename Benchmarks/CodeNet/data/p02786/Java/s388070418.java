import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long h = in.nextLong();
        long count = 0;
        long monster = 1;
        while(true) {
            count += monster;
            h = (long)Math.floor((double)h / 2.0);
            if(h<1) {
                break;
            }
            monster *= 2;
        }
        System.out.println(count);
    }
}
