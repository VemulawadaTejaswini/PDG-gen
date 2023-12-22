import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int a[] = new int[3];
            for (int j = 0; j < 3; j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            if (a[0]*a[0] + a[1]*a[1] == a[2]*a[2]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}