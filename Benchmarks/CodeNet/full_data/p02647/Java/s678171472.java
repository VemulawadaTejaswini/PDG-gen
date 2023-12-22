import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        // 配列
        int[] a = new int[n+1];
        int[] light = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }

        for (int t =0;t<k;t++){
            Arrays.fill(light, 1);
            for(int i=1;i<=n;i++){
                if(a[i] != 0) {
                    for(int j = i-a[i];j <= i+a[i];j++) {
                        if(j>0 && j <= n && j != i) {
                            light[j]++;
                        }
                    }
                }
            }
            a = light.clone();
        }

        String ans = ""; 
        for(int i=1;i<=n;i++){
            ans = ans + a[i] + " ";
        }

        System.out.println(ans.trim());
    }
}
