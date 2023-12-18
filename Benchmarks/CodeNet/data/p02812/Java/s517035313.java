import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, i, k=0;
        String S="";
        N = scan.nextInt();
        S= scan.nextLine();
        for(i=0; i<N-2; i++){
                if (S.charAt(i)=='A'&&S.charAt(i+1)=='B'&&S.charAt(i+2)=='C') {
                    k = k + 1;
            }
        }
        System.out.println(k);
    }
}