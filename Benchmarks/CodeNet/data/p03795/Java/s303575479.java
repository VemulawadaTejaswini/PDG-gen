
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n = Integer.parseInt(sc.next());
        System.out.println(factorialPower(n));
    }

    public static long factorialPower(long a){
        final int big = 1000000000 + 7;
        long power = 1;
        while(a>0){
            power = (power*(a%big))%big;
            a--;
        }
        return power;
    }
}