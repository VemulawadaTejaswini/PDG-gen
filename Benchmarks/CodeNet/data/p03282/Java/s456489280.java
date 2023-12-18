import java.util.Scanner;

public class Main {
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
            else{
                for(long k = 0; k < 5000000; k++){
                    for(long k1 = 0; k1 < 1000000000; k1++){
                        count += val;
                    }
                    if(K <= count)
                        return String.valueOf((char)('0' + val));
                }
            }


        }
        return null;
    }
}
