import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int res = x;
        for(int i=0; i<d; i++) {
            for(int j=0; j<n; j++) {
                if(a[j] == 1) {
                    res ++;
                } else {
                    if(i % a[j] == 0) res++;
                }
            }
        }

        System.out.println(res);
    }

}
