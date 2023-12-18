
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        int count = 0;
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
            if(a[i] >= (0.25f / M)){
                count++;
            }
        }
        System.out.println(count >= M ? "Yes" : "No");
    }
}
