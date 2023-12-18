import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = 1; //sc.nextInt();
        if(N % 2 == 0){
            System.out.println((double)2/N);
        }
        else{
            System.out.println((double)2/N+1);
        }
    }
}