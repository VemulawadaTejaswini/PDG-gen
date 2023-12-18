import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        long sum = 0;
        for(int i=0; i<m; i++){
            sum += stdIn.nextLong();
        }

        if(sum <= n){
            System.out.println(n - sum);
        }else{
            System.out.println(-1);
        }
    }
}