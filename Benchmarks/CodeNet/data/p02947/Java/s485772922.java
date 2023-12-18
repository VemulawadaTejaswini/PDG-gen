import java.util.*;
class GreenBin{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[270];
        for(int i = 0; i < n; i++){
            String s = scanner.next();
            int count = 0;
            for(int j = 0; j < 10; j++){
                count += (s.charAt(j)-'a');
            }
            a[count]++;
        }
        long ans = 0;
        for(int i = 0; i < 270; i++){
            ans += a[i] * (a[i] - 1) / 2;
        }
        System.out.println(ans);
    }
}
