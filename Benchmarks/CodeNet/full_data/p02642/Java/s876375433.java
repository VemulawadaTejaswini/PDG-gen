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

        if(a[0] != a[1]) {
            cnt++;
        }

        for(int i=1;i<n-1;i++){
            if((a[i] == a[i+1]) || (a[i] == a[i-1])) {
                continue;
            }

            cnt++;
            for(int j=0;j<i;j++){ 
                if(a[i] % a[j] == 0) {
                    cnt--;
                    break;
                } 
            }
        }

        if(a[n-1] != a[n-2]) {
            cnt++;
            for(int i=0;i<n-1;i++){
                if(a[n-1] % a[i] == 0){
                    cnt--;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}