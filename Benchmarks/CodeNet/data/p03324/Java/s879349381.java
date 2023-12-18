import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {

        //System.out.println("aaaaaaaaa");

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
  
        int[] intArray = new int[N];
        for (int i = 0; i < N; i++) {
            intArray[i] = sc.nextInt(); // Integer
        }
        
        int res = IntStream.of(intArray).map(ele -> niDeWaru(ele)).sum();
        System.out.println(res);

    }

    private static int niDeWaru(int ele) {
        int result = 0;
        while (ele % 2 == 0) {
            ele = ele /2;
            result++;
        }
        return result;
    }
}
