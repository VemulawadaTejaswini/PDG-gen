import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int count = 0; int i ;
            for ( i = 0; i >= 0; i++) {
                if (Math.abs(A - i)== Math.abs(B - i)){
                count ++;
                break;
                }
            }
            if (count > 0 ){
            System.out.println(i); }
            else{
                System.out.println("IMPOSSIBLE");
            }}}