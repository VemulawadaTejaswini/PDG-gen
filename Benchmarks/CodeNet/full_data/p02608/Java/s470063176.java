import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            System.out.println(answer(i));
        }
        
    }
    public static int answer(int n) {
        int answer = 0;

        for (int x = 1; x < 33; x++) {
            for (int y = 1; y < 33; y++) {
                for (int z = 1; z < 33; z++) {
                    if (x * x + y * y + z * z + x * y + y * z + z * x == n) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}