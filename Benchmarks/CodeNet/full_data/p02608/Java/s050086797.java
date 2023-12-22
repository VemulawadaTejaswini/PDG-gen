import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int n = 1; n <= N ; n++) {
            int ans = 0;
            for (int i = 1; i*1 <= 10000; i++) {
                for (int j = 1; j*j <=10000 ; j++) {
                    for (int k = 1; k*k <=10000 ; k++) {
                        if(i*i+j*j+k*k+i*j+i*k+j*k==n){
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }

    }



}