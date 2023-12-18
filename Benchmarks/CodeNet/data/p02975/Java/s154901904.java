import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        boolean isXor = true;
        if((ar[ar.length-1]^ar[1]) != ar[0]){
            isXor = false;
        }else if((ar[0] ^ ar[ar.length-2]) != ar[ar.length-1]){
          isXor = false;
        } else {
            for (int i = 1; i < ar.length-1; i++) {
                if((ar[i-1]^ar[i+1]) != ar[i]){
                    isXor = false;
                    break;
                }
            }
        }
        System.out.println(isXor?"Yes":"No");
    }
}
