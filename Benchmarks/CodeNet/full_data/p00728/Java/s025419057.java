import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while(n!=0){
                int average=0;
                for (int i = 0; i < n; i++) {
                    int scores = sc.nextInt();
                    average += scores;
                }
                average /= n;
                System.out.println(average);
                n = sc.nextInt();
            }
        }
    }
}

