import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] ar = new long[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextLong();
        }


        boolean flag = true;
        for (int i = ar.length - 2; i >= 0; i--) {
            if (ar[i + 1] < ar[i] && ar[i] - ar[i + 1] > 1) {
                flag = false;
                break;
            }else if(ar[i + 1] < ar[i] && ar[i] - ar[i + 1] == 1){
                ar[i]--;
            }
        }

        System.out.println(flag ? "Yes" : "No");
    }
}
