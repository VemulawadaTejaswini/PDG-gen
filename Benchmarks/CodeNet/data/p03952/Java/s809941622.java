import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int s = scan.nextInt();
        
        if(s == 2 * N - 1 || s == 1) {
            System.out.println("No");
            return;
        }
        
        System.out.println("Yes");
        
        int outputCount = 1;
        for(int i = 0; i < 2 * N - 1; i++) {
            if(i == N - 2) {
                System.out.println(s - 1);
            } else if(i == N - 1) {
                System.out.println(s);
            } else if(i == N) {
                System.out.println(s + 1);
            } else {
                if(outputCount == s - 1) outputCount += 3;
                System.out.println(outputCount);
                outputCount++;
            }
        }
    }
}
