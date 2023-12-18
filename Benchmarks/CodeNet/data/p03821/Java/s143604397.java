import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a  = new int[N];
        int[] b  = new int[N];
        for (int i = 0; i < N ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int answer = 0;
        for(int i = N-1; i>=0; i--) {
            a[i] += answer;
            int r = a[i]%b[i];
            if(r==0) {
                continue;
            } else {
                answer += b[i] - r;
            }
        }
        System.out.println(answer);
    }
}