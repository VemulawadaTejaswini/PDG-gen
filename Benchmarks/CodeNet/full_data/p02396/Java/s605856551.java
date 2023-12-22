import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 1;
        while(x != 0){
            System.out.println(String.format("Case %d: %d", count, x));
            x = sc.nextInt();
            count++;
        }
    }
}

