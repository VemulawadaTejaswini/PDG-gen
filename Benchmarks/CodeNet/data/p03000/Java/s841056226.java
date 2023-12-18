import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        for(int i = 0; i<n; i++) {
            l[i] = sc.nextInt();
        }
        long now = 0;
        long count = 1;
        for(int i = 0; i<n; i++) {
            now = now + l[i];
            if(now<=x)count++;
        }

            System.out.println(count);
    }
}