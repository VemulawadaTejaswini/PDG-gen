import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        int k = stdIn.nextInt();
        int N1[] = new int[200000];
        int M1[] = new int[200000];
        int read[] = new int[200000];
        int count = 0;

        for (int i = 0; i < N; i++) {
            N1[i] = stdIn.nextInt();
        }
        for (int i = 0; i < M; i++) {
            M1[i] = stdIn.nextInt();
        }
        for (int i = 0; i < 100000000; i++) {           
            read[i] += N1[i];
            if (read[i] >= k) { 
                break;
            }
            if (N1[i+1] == 0 && M1[i] == 0) { 
                break;
            }
            count++;

            read[i] += M1[i];
            if (read[i] >= k) { 
                break;
            }
            if (N1[i+2] == 0 && M1[i+1] == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}