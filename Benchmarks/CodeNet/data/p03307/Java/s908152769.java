import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        System.out.println((N%2==0)?N:2*N);
        sc.close();
    }
}