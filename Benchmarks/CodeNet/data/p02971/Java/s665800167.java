import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i] = stdIn.nextInt();
        }
        int max;
        for(int i = 0;i < n; i++) {
            max = 0;
            for(int j = 0;j < n;j++) {
                if(j != i){
                    if(a[j] > max) {
                        max = a[j];
                    }
                }
            }
            System.out.println(max);
        }
    }
}