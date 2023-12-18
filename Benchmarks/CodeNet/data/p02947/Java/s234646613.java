import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] ar = new String[n];
        for (int i = 0; i < n; i++) {
            char[] v = scan.next().toCharArray();
            Arrays.sort(v);
            ar[i] = new String(v);
        }

        Arrays.sort(ar);
        long cnt = 0;
        long sum = 0;
        for (int i = 1; i < ar.length; i++) {
            if(ar[i].equals(ar[i-1])){
                cnt++;
                sum+=cnt;
            }else{
                cnt = 0;
            }
        }

        System.out.println(sum);
    }
}
