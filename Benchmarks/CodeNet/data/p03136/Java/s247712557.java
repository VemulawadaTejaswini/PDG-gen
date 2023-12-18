import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int l[] = new int[t];
        int sg = 0;
        for(int i = 0; i < t; i++) {
            l[i] = sc.nextInt();
            sg += l[i];
        }
        int m = max(l);
        sg -= l[m];
        if(sg > l[m]) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }

    private static int max(int[] a) {
        int maxi = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[maxi] < a[i]) {
                maxi = i;
            }
        }
        return maxi;
    }


}
