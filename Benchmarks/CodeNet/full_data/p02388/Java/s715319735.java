import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(cubic(scn.nextInt()));
    }
    
    private static int cubic(int x) {
        return x * x * x;
    }
}