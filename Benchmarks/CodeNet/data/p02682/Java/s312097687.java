import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (i < a) {
                max += 1;
            } else if (i < a + b){
            } else {
                max += -1;
            }
        }
        System.out.println(max);
    }
}