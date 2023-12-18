import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String v = scan.next();
        char[] S = v.toCharArray();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(S[i] != S[j] && S[j] != S[k] && S[k] != S[i] && j-i != k-j){
                        sum+=1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
