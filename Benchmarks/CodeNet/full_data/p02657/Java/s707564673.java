import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(A * B);
        in.close();
    }
}