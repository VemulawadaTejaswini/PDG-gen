
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] list = new int[T];
        for(int i = 0 ; i < T ; i++)
            list[i] = sc.nextInt();
        int[] path = new int[T];
        path[0] = 0;
        path[1] = Math.abs(list[0]-list[1]);
        for(int i = 2 ; i < T ; i ++)
        {
            path[i] = Math.min(path[i-2]+(Math.abs(list[i]-list[i-2])),path[i-1]+(Math.abs(list[i-1]-list[i])));
        }
        
        System.out.println(path[T-1]);
    }
}
