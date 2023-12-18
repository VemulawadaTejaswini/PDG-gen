import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
//        int[] arr = new int[k*2-1];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k*2-1; i++){
//            arr[i] = x-k+1+i;
            sb.append(x-k+1+i).append(' ');
        }
        System.out.println(sb);
    }
}
