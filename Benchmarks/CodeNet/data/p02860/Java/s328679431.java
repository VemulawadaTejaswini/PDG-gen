import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String S = input.next();

        if (N%2 ==0){
            if (S.substring(0,N/2).equals(S.substring(N/2,N))){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }else {
            System.out.println("No");
        }
    }
}