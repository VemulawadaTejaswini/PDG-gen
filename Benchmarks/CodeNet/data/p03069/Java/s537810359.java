import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        
        int count = 0;
        // char setchar = '0';
        // for (int i=0; i<N-2; i++) {
        //     if (S[i] == '#' && S[i+1] == '.') {
        //         S[i+1] = '#';
        //         count++;
        //     }
        // }
        for (int i=N; i>0; i--) {
            if (S[i] == '.' && S[i-1] == '#') {
                S[i] = '.';
                count++;
            }
        }
        System.out.println(count);
    }
}