import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        int A1;
        int num = 0;
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        A1 = S.length();
        for(int i=0; i<(A1/2); i++){
            if(S.charAt(i) != S.charAt(A1-i-1)){
                num++;
            }
        }
        System.out.println(num);
    }
}