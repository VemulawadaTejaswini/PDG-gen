import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        String ans = "No";
        for(int i = 1; i <= 9; i++){
            if((n%i == 0) && (1 <= n/i) && (n/i <= 9)){
                ans = "Yes";
            }
        }
        
        System.out.println(ans);
    }
}