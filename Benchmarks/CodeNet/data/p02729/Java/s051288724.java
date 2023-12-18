import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        //int sum=(N+M)*(N+M-1)/2;
        int even,odd;
        
        if (N>=2) {
            even=N*(N-1)/2;
        } else {
            even=0;
        }
        
        if (M>=2) {
            odd=M*(M-1)/2;
        } else {
            odd=0;
        }   
        
        System.out.println(odd+even);
    }
}