import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S="";
        int N, i, k=0;
        S= scan.nextLine();
        N = scan.nextInt();
        for(i=0; i<N-2; i++){
                if (S.charAt(i)=='A'&&S.charAt(i+1)=='B'&&S.charAt(i+2)=='C') {
                    k = k + 1;
            }
        }
        System.out.println(k);
    }
}