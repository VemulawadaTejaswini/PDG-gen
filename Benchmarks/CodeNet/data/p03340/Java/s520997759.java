import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        int i = 0;
        while(i < N){
            a[i] = sc.nextInt();
            i++;
        }
        int count = N;
        long memo_xor = a[0];
        long memo_sum = a[0];
        int len = 0;
        boolean last_flag = false;
        for (int j = 0; j < N; j++) {
            if(len > 0) {
                len--;
            }
            for (int k = len + 1; k < N - j; k++) {
                memo_xor = memo_xor ^ a[j + k];
                memo_sum = memo_sum + a[j + k];
                if(memo_sum == memo_xor){
                    len++;
                    if(j + k == N - 1){
                        last_flag = true;
                        break;
                    }
                }else{
                    if(k == 1){
                        memo_xor = a[j + k];
                        memo_sum = a[j + k];
                    }else{
                        memo_xor = memo_xor ^ a[j + k] ^ a[j];
                        memo_sum = memo_sum - a[j + k] - a[j];
                    }
                    break;
                }
            }
            if (last_flag){
                count += len * (len + 1) / 2;
                break;
            }else{
                count += len;
            }
        }
        System.out.println(count);
    }
}
