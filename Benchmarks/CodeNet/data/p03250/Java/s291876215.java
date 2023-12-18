import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] x = {s.nextInt(),s.nextInt(),s.nextInt()};
        Arrays.sort(x);
        String t = ""+x[2]+x[1];
        System.out.println(Integer.parseInt(t)+x[0]);
    
}