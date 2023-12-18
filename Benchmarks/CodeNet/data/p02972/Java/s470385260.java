import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int[] a = new int[n+1];
        for(int i=1; i<=n; i++){
            a[i] = stdIn.nextInt();
        }

        int[] b = new int[n+1];
        for(int i=n; i>=1; i--){
            int multipleSum = a[i];
            for(int j=2; i*j<=n; j++){
                multipleSum += b[i*j];
            }

            b[i] = multipleSum % 2;
        }

        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += b[i];
        }
        System.out.println(sum);
        for(int i=1; i<=n; i++){
            if(b[i] == 1)
                System.out.print(i + " ");
        }
    }
}
