import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.next());
        int cnt = 0;
        for(int i=0;i<n;i++) {
        	cnt+=isPrime(Integer.valueOf(scan.next()));
        }
        System.out.println(cnt);
        scan.close();
    }
    public static int isPrime(int n) {
        if (n<2) {
        	return 0;
        }
        else if (n==2) {
        	return 1;
        }
        else if (n%2==0) {
        	return 0;
        }
        for (int i = 3; i <= Math.sqrt(n); i+=2){
            if (n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
