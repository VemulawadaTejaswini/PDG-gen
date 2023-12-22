import java.util.*;

public class Main {
    public static int MAX = 246913;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        boolean[] isPrime = sieve();
        int[] answers = getAnswers(isPrime);
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            System.out.println(answers[n]);
        }
    }
    
    public static boolean[] sieve() {
        boolean[] isPrime = new boolean[MAX];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < MAX / 2; i++) {
            if (!isPrime[i]) continue;
            for (int j = i+i; j < MAX; j += i) {
                isPrime[j] = false;
            }
        }
        
        return isPrime;
    }
    
    public static int[] getAnswers(boolean[] isPrime) {
        int[] answers = new int[MAX/2+1];
        answers[1] = 1;
        for (int i = 2; i <= MAX / 2; i++) {
            int temp = answers[i-1];
            if (isPrime[i]) temp--;
            if (isPrime[(i-1)*2+1]) temp++;
            answers[i] = temp;
        }
        return answers;
    }
}


