import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        boolean isBreak = false;
        while(!isBreak) {
            for(int i=0; i<a.length; i++) {
                if(a[i] % 2 == 0) {
                    a[i] = a[i] / 2;
                } else {
                    isBreak = true;
                    break;
                }
                if(i == a.length-1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
