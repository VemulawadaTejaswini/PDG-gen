import java.util.Scanner;

public class Main {
    int[] num= {0, 1, };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int K = sc.nextInt();

        System.out.println(checkInf(S, K));
    }

    public static String checkInf(String S, int K){
        long count = 0;
        for(int i = 0; i < S.length(); i++){
            int val = S.charAt(i) - '0';
            if(val == 1)
                count++;
            else
                return String.valueOf((char)('0' + val));
            if(K <= count)
                return String.valueOf((char)('0' + val));
             
        }
        return null;
    }
}