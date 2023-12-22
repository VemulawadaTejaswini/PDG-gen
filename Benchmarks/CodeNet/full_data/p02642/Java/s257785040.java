import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 配列
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int cnt = 0;
        boolean flg = false;
        for(int i=0;i<n;i++){
            if(!((i == n-1 || a[i] != a[i+1]) && (i == 0 || a[i] != a[i-1]))) {
                continue;
            }

            flg = false;
            for(int j=0;j<i;j++){ 
                if(a[i] % a[j] == 0) {
                    flg = true;
                    break;
                } 
            }
            if(!flg) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}