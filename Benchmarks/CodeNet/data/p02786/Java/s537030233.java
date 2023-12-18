import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        for(long i=0;;){
            if((1l<<i)<=n)i++;
            else {
                System.out.println((1l<<i)-1);
                break;
            }
        }


    }
}
