import java.util.*;
public class Main {
    static PriorityQueue<Long> queue;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ca = sc.nextInt();
        String str = sc.next();
        int cnt = 0;
        int[] a = new int[n];
        int[] b = new int[n];
        
        for(int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c=='o') {
                cnt++;
                a[i] = cnt;
                i += ca;
            }
        }
        if(cnt>k) return;
        for(int i = str.length()-1; i>=0; i--) {
            char c = str.charAt(i);
            if(c=='o') {
                b[i] = cnt;
                cnt--;
                i -= ca;
            }
        }

        for(int i = 0; i<str.length(); i++) {
            if(a[i]==b[i] && a[i]!=0 &&b[i] !=0) System.out.println(i+1);
        }

    }
}