import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int k = n;
        int cnt = 0;
        int temp = 0;
        while(k==0) {
            if(n%k==0 && n/k==1) {
                cnt++;
            } else if(n-k==1) {
                cnt++;
            }
            k=k-1;
        }
        System.out.println(String.valueOf(cnt));
    }
}