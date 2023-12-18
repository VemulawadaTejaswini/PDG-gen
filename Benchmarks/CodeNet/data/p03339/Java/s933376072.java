import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int[] w = new int[a+1];
        int[] e = new int[a+1];
        int min = a;
        for(int i=1; i<=a; i++) {
            if(c[i-1] == 'W') {
                w[i]++;
            }
            else {
                e[i]++;
            }
            w[i] += w[i-1];
            e[i] += e[i-1];
        }
        for(int i=1; i<=a; i++) {
            min = Math.min(min, w[i-1]+e[a]-e[i]);
        }
        System.out.println(min);
    }
}