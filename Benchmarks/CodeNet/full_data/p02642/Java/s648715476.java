import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 配列
        int n = sc.nextInt();

        int[] a = new int[n+1];
        for(int i=1;i<n+1;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int cnt = 0;
        boolean flg = false;
        for(int i=1;i<n+1;i++){
            flg = false;
            for(int j=1;j<i;j++){ 
                if((a[i] == a[j]) || (a[i] % a[j] == 0)) {
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