
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int odd =0, even =0;
        for (int i =1; i <= n/k;i++){
            int t = i*k;
            if (t%2 != 0)
                continue;
            if (t/2 %k == 0)
                even++;
            else
                odd++;
        }
        System.out.println((long)odd*odd*odd+even*even*even);
    }

}