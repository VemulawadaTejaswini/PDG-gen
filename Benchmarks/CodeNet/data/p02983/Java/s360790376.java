import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        int min = 2019 * 2019;
        int last = Math.min(R, L + 2050);
        
        for(int i = L; i < last; i++){
            min = Math.min(min, (i * (i+1)) % 2019 );
        }
        
        System.out.println( min );
        
    }
}
