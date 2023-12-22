import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt(); scanner.nextLine();
        String S = scanner.nextLine();

        if(S.length() <= K){
            System.out.println( S );

        }else{
            System.out.println( S.substring(0,K) + "..." );
        }

        scanner.close();
    }
}