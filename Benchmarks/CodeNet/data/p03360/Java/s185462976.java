import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = {a,b,c};
        Arrays.sort(arr);

        for (int i = 0; i<k; i++){
            arr[2] = arr[2] * 2;
        }
        System.out.println(arr[0]+arr[1]+arr[2]);
    }
}