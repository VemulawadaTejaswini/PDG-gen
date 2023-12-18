import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int sum = 0;
        for(int i = 1; i <= N-2; i++){
            for(int j = i + 1; j <= N-1; j++){
                if(S.charAt(i-1) == S.charAt(j-1)) continue;
                for(int k = j + 1; k <= N; k++){
                    if(S.charAt(i-1) != S.charAt(j-1) && 
                    S.charAt(i-1) != S.charAt(k-1) &&
                    S.charAt(k-1) != S.charAt(j-1) &&
                    j-i != k-j){
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
} 