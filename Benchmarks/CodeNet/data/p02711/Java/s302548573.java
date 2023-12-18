
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
    
        
        sc.close();

        boolean bool = false;
        int n = N % 10;
        if(n==7){
            bool = true;
        }
        n = N / 10;
        n = n % 10;
        if(n == 7){
            bool = true;
        }
        n = N / 100;
        if( n == 7){
            bool = true;
        }

        if(bool){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}      
