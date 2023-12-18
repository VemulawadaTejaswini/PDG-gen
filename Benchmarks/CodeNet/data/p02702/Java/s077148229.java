import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        long L = S.length();
        int count = 0;
        String Kiridashi = "";

        for(int i = 1; i <= L-3; i++){
            for(int j=i+3; j<=L; j++){
                Kiridashi = S.substring(i-1,j);
                if(Long.parseLong(Kiridashi)%2019 == 0){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}