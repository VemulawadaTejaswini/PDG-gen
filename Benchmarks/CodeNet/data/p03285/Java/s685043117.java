import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            int N, i, j;
            N = input.nextInt();

            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                    if (i * 4 + j * 7 == N) {
                        System.out.println("Yes");
                    }

                }

            }
            System.out.println("No");

        }
    }
