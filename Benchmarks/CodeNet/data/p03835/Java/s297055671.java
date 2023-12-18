import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        
        String[] strings = line.split(" ");
        
        int K = Integer.parseInt(strings[0]);
        int S = Integer.parseInt(strings[1]);
        
        int count = 0;
        for (int i = 0; i <= K; i++) {
            for (int j = 0; j <= K; j++) {
                for (int k = 0; k <= K; k++) {
                    if (i + j + k == S) {
                        count++;
                    }
                    if (i + j + k > S) {
                        break;
                    }
                } 
            }
        }
        System.out.println(count);
    }
}
